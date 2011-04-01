package jmeta;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class ParserDeNumeroPorExtensoTest {
	
	private ParserDeNumeroPorExtenso parser;


	@Before
	public void setup() {
		parser = new ParserDeNumeroPorExtenso();
	}
	
	@Test
	public void digitos() {
		assertEquals(1, parser.parse("um"));
		assertEquals(2, parser.parse("dois"));
		assertEquals(3, parser.parse("tres"));
		assertEquals(4, parser.parse("quatro"));
		assertEquals(5, parser.parse("cinco"));
		assertEquals(6, parser.parse("seis"));
		assertEquals(7, parser.parse("sete"));
		assertEquals(8, parser.parse("oito"));
		assertEquals(9, parser.parse("nove"));
	}
	
	@Test
	public void dezenas() {
		assertEquals(10, parser.parse("dez"));
		assertEquals(20, parser.parse("vinte"));
		assertEquals(30, parser.parse("trinta"));
		assertEquals(40, parser.parse("quarenta"));
		assertEquals(50, parser.parse("cinquenta"));
		assertEquals(60, parser.parse("sessenta"));
		assertEquals(70, parser.parse("setenta"));
		assertEquals(80, parser.parse("oitenta"));
		assertEquals(90, parser.parse("noventa"));
	}

	@Test
	public void centenas() {
		assertEquals(100, parser.parse("cem"));
		assertEquals(200, parser.parse("duzentos"));
		assertEquals(300, parser.parse("trecentos"));
		assertEquals(400, parser.parse("quatrocentos"));
		assertEquals(500, parser.parse("quinhentos"));
		assertEquals(600, parser.parse("seiscentos"));
		assertEquals(700, parser.parse("setecentos"));
		assertEquals(800, parser.parse("oitocentos"));
		assertEquals(900, parser.parse("novecentos"));
	}
	
	@Test
	public void centenasEDezenas() {
		assertEquals(110, parser.parse("cento dez"));		
		assertEquals(150, parser.parse("cento cinquenta"));		
		assertEquals(390, parser.parse("trecentos noventa"));		
	}

	@Test
	public void centenasEunidades() {
		assertEquals(101, parser.parse("cento e um"));		
		assertEquals(409, parser.parse("quatrocentos e nove"));		
		assertEquals(205, parser.parse("duzentos e cinco"));		
	}

	@Test
	public void centenasDezenasEunidades() {
		assertEquals(278, parser.parse("duzentos setenta e oito"));		
		assertEquals(983, parser.parse("novecentos oitenta e tres"));		
	}
	
	@Test
	public void unidadeDemilhares() {
		assertEquals(1000, parser.parse("mil"));
		assertEquals(2000, parser.parse("dois mil"));
		assertEquals(9000, parser.parse("nove mil"));
	}
	
	@Test
	public void dezenaDeMilhares() {
		assertEquals(10000, parser.parse("dez mil"));
		assertEquals(20000, parser.parse("vinte mil"));
		assertEquals(90000, parser.parse("noventa mil"));		
	}

	@Test
	public void centenaDeMilhares() {
		assertEquals(100000, parser.parse("cem mil"));
		assertEquals(200000, parser.parse("duzentos mil"));
		assertEquals(900000, parser.parse("novecentos mil"));		
	}

	@Test
	public void milharesComplexos() {
		assertEquals(222222, parser.parse("duzentos vinte dois mil duzentos vinte dois"));
		assertEquals(123456, parser.parse("cento vinte tres mil quatrocentos cinquenta e seis"));
		assertEquals(987654, parser.parse("novecentos oitenta e sete mil seiscentos cinquenta e quatro"));
	}


	@Test
	public void milhoes() {
		parser.trace("dois milh›es duzentos vinte dois mil duzentos vinte dois");

		assertEquals(2222222, parser.parse("dois milh›es duzentos vinte dois mil duzentos vinte dois"));
		assertEquals(99123456, parser.parse("noventa e nove milh›es cento vinte tres mil quatrocentos cinquenta e seis"));
		assertEquals(777987654, parser.parse("setecentos setenta e sete milh›es novecentos oitenta e sete mil seiscentos cinquenta e quatro"));
	}
}
