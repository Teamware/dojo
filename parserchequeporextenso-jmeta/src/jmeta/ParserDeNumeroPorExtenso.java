package jmeta;
// generated by jmeta on Fri Apr 01 02:38:34 BRT 2011
// do not modify, instead edit original .jmeta file
import jmeta.*;



public class ParserDeNumeroPorExtenso extends BaseParser {
  public Object start() { Object _t=null; int _start=_pos;
    _t=_retrieve("ParserDeNumeroPorExtenso"+"."+"start"); if (_t!=NOT_MEMOIZED) return _t;
    Object n=null;    do {
    { int _p0=_pos; _t=ERROR; do { //and
    _t=numero();
    n=_t;
    if (_t==ERROR) break;
    _t=end();
    if (_t==ERROR) throw new SyntaxError("", _pos, _string, _list);
    _t=n;
    if (_t==ERROR) throw new SyntaxError("", _pos, _string, _list);
  } while(false); if (_t==ERROR) _pos=_p0; }
    _t=_memoize("ParserDeNumeroPorExtenso"+"."+"start", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="start"; return _t;
  }
  public Object numero() { Object _t=null; int _start=_pos;
    _t=_retrieve("ParserDeNumeroPorExtenso"+"."+"numero"); if (_t!=NOT_MEMOIZED) return _t;
        do {
    _t=ERROR; do{ //or
    _t=milhoes();
    if (_t!=ERROR) break;

    _t=milhares();
    if (_t!=ERROR) break;

    _t=simples();
    if (_t!=ERROR) break;
  } while(false);
    _t=_memoize("ParserDeNumeroPorExtenso"+"."+"numero", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="numero"; return _t;
  }
  public Object milhoes() { Object _t=null; int _start=_pos;
    _t=_retrieve("ParserDeNumeroPorExtenso"+"."+"milhoes"); if (_t!=NOT_MEMOIZED) return _t;
    Object s=null;    do {
    _t=ERROR; do{ //or
    { int _p2=_pos; _t=ERROR; do { //and
      _t=simples();
      s=_t;
      if (_t==ERROR) break;
      _t=ws();
      if (_t==ERROR) break;
      _t=_str("milh�es");
      if (_t==ERROR) break;
      _t=__act1(s);
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p2; }
    if (_t!=ERROR) break;

    { int _p4=_pos; _t=ERROR; do { //and
      _t=ws();
      if (_t==ERROR) break;
      _t=_str("milh�o");
      if (_t==ERROR) break;
      _t=__act3(s);
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p4; }
    if (_t!=ERROR) break;
  } while(false);
    _t=_memoize("ParserDeNumeroPorExtenso"+"."+"milhoes", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="milhoes"; return _t;
  }
  public Object simples() { Object _t=null; int _start=_pos;
    _t=_retrieve("ParserDeNumeroPorExtenso"+"."+"simples"); if (_t!=NOT_MEMOIZED) return _t;
    Object c=null; Object d=null; Object u=null;    do {
    _t=ERROR; do{ //or
    { int _p6=_pos; _t=ERROR; do { //and
      _t=centena();
      c=_t;
      if (_t==ERROR) break;
      _t=dezena();
      d=_t;
      if (_t==ERROR) break;
      _t=ws();
      if (_t==ERROR) break;
      _t=_str("e");
      if (_t==ERROR) break;
      _t=unidade();
      u=_t;
      if (_t==ERROR) break;
      _t=__act5(c,d,u);
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p6; }
    if (_t!=ERROR) break;

    { int _p8=_pos; _t=ERROR; do { //and
      _t=centena();
      c=_t;
      if (_t==ERROR) break;
      _t=dezena();
      d=_t;
      if (_t==ERROR) break;
      _t=unidade();
      u=_t;
      if (_t==ERROR) break;
      _t=__act7(c,d,u);
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p8; }
    if (_t!=ERROR) break;

    { int _p10=_pos; _t=ERROR; do { //and
      _t=centena();
      c=_t;
      if (_t==ERROR) break;
      _t=dezena();
      d=_t;
      if (_t==ERROR) break;
      _t=__act9(c,d,u);
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p10; }
    if (_t!=ERROR) break;

    { int _p12=_pos; _t=ERROR; do { //and
      _t=centena();
      c=_t;
      if (_t==ERROR) break;
      _t=ws();
      if (_t==ERROR) break;
      _t=_str("e");
      if (_t==ERROR) break;
      _t=unidade();
      u=_t;
      if (_t==ERROR) break;
      _t=__act11(c,d,u);
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p12; }
    if (_t!=ERROR) break;

    _t=centena();
    if (_t!=ERROR) break;

    _t=dezena();
    if (_t!=ERROR) break;

    _t=unidade();
    if (_t!=ERROR) break;
  } while(false);
    _t=_memoize("ParserDeNumeroPorExtenso"+"."+"simples", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="simples"; return _t;
  }
  public Object milhares() { Object _t=null; int _start=_pos;
    _t=_retrieve("ParserDeNumeroPorExtenso"+"."+"milhares"); if (_t!=NOT_MEMOIZED) return _t;
    Object m=null; Object s=null;    do {
    _t=ERROR; do{ //or
    { int _p14=_pos; _t=ERROR; do { //and
      _t=milhares();
      m=_t;
      if (_t==ERROR) break;
      _t=simples();
      s=_t;
      if (_t==ERROR) break;
      _t=__act13(m,s);
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p14; }
    if (_t!=ERROR) break;

    { int _p16=_pos; _t=ERROR; do { //and
      _t=simples();
      s=_t;
      if (_t==ERROR) break;
      _t=milhar();
      if (_t==ERROR) break;
      _t=__act15(m,s);
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p16; }
    if (_t!=ERROR) break;

    _t=milhar();
    if (_t!=ERROR) break;
  } while(false);
    _t=_memoize("ParserDeNumeroPorExtenso"+"."+"milhares", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="milhares"; return _t;
  }
  public Object milhar() { Object _t=null; int _start=_pos;
    _t=_retrieve("ParserDeNumeroPorExtenso"+"."+"milhar"); if (_t!=NOT_MEMOIZED) return _t;
        do {
    { int _p18=_pos; _t=ERROR; do { //and
    _t=ws();
    if (_t==ERROR) break;
    _t=_str("mil");
    if (_t==ERROR) break;
    _t=__act17();
    if (_t==ERROR) break;
  } while(false); if (_t==ERROR) _pos=_p18; }
    _t=_memoize("ParserDeNumeroPorExtenso"+"."+"milhar", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="milhar"; return _t;
  }
  public Object unidade() { Object _t=null; int _start=_pos;
    _t=_retrieve("ParserDeNumeroPorExtenso"+"."+"unidade"); if (_t!=NOT_MEMOIZED) return _t;
        do {
    _t=ERROR; do{ //or
    { int _p20=_pos; _t=ERROR; do { //and
      _t=ws();
      if (_t==ERROR) break;
      _t=_str("um");
      if (_t==ERROR) break;
      _t=__act19();
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p20; }
    if (_t!=ERROR) break;

    { int _p22=_pos; _t=ERROR; do { //and
      _t=ws();
      if (_t==ERROR) break;
      _t=_str("dois");
      if (_t==ERROR) break;
      _t=__act21();
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p22; }
    if (_t!=ERROR) break;

    { int _p24=_pos; _t=ERROR; do { //and
      _t=ws();
      if (_t==ERROR) break;
      _t=_str("tres");
      if (_t==ERROR) break;
      _t=__act23();
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p24; }
    if (_t!=ERROR) break;

    { int _p26=_pos; _t=ERROR; do { //and
      _t=ws();
      if (_t==ERROR) break;
      _t=_str("quatro");
      if (_t==ERROR) break;
      _t=__act25();
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p26; }
    if (_t!=ERROR) break;

    { int _p28=_pos; _t=ERROR; do { //and
      _t=ws();
      if (_t==ERROR) break;
      _t=_str("cinco");
      if (_t==ERROR) break;
      _t=__act27();
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p28; }
    if (_t!=ERROR) break;

    { int _p30=_pos; _t=ERROR; do { //and
      _t=ws();
      if (_t==ERROR) break;
      _t=_str("seis");
      if (_t==ERROR) break;
      _t=__act29();
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p30; }
    if (_t!=ERROR) break;

    { int _p32=_pos; _t=ERROR; do { //and
      _t=ws();
      if (_t==ERROR) break;
      _t=_str("sete");
      if (_t==ERROR) break;
      _t=__act31();
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p32; }
    if (_t!=ERROR) break;

    { int _p34=_pos; _t=ERROR; do { //and
      _t=ws();
      if (_t==ERROR) break;
      _t=_str("oito");
      if (_t==ERROR) break;
      _t=__act33();
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p34; }
    if (_t!=ERROR) break;

    { int _p36=_pos; _t=ERROR; do { //and
      _t=ws();
      if (_t==ERROR) break;
      _t=_str("nove");
      if (_t==ERROR) break;
      _t=__act35();
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p36; }
    if (_t!=ERROR) break;
  } while(false);
    _t=_memoize("ParserDeNumeroPorExtenso"+"."+"unidade", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="unidade"; return _t;
  }
  public Object dezena() { Object _t=null; int _start=_pos;
    _t=_retrieve("ParserDeNumeroPorExtenso"+"."+"dezena"); if (_t!=NOT_MEMOIZED) return _t;
        do {
    _t=ERROR; do{ //or
    { int _p38=_pos; _t=ERROR; do { //and
      _t=ws();
      if (_t==ERROR) break;
      _t=_str("dez");
      if (_t==ERROR) break;
      _t=__act37();
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p38; }
    if (_t!=ERROR) break;

    { int _p40=_pos; _t=ERROR; do { //and
      _t=ws();
      if (_t==ERROR) break;
      _t=_str("vinte");
      if (_t==ERROR) break;
      _t=__act39();
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p40; }
    if (_t!=ERROR) break;

    { int _p42=_pos; _t=ERROR; do { //and
      _t=ws();
      if (_t==ERROR) break;
      _t=_str("trinta");
      if (_t==ERROR) break;
      _t=__act41();
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p42; }
    if (_t!=ERROR) break;

    { int _p44=_pos; _t=ERROR; do { //and
      _t=ws();
      if (_t==ERROR) break;
      _t=_str("quarenta");
      if (_t==ERROR) break;
      _t=__act43();
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p44; }
    if (_t!=ERROR) break;

    { int _p46=_pos; _t=ERROR; do { //and
      _t=ws();
      if (_t==ERROR) break;
      _t=_str("cinquenta");
      if (_t==ERROR) break;
      _t=__act45();
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p46; }
    if (_t!=ERROR) break;

    { int _p48=_pos; _t=ERROR; do { //and
      _t=ws();
      if (_t==ERROR) break;
      _t=_str("sessenta");
      if (_t==ERROR) break;
      _t=__act47();
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p48; }
    if (_t!=ERROR) break;

    { int _p50=_pos; _t=ERROR; do { //and
      _t=ws();
      if (_t==ERROR) break;
      _t=_str("setenta");
      if (_t==ERROR) break;
      _t=__act49();
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p50; }
    if (_t!=ERROR) break;

    { int _p52=_pos; _t=ERROR; do { //and
      _t=ws();
      if (_t==ERROR) break;
      _t=_str("oitenta");
      if (_t==ERROR) break;
      _t=__act51();
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p52; }
    if (_t!=ERROR) break;

    { int _p54=_pos; _t=ERROR; do { //and
      _t=ws();
      if (_t==ERROR) break;
      _t=_str("noventa");
      if (_t==ERROR) break;
      _t=__act53();
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p54; }
    if (_t!=ERROR) break;
  } while(false);
    _t=_memoize("ParserDeNumeroPorExtenso"+"."+"dezena", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="dezena"; return _t;
  }
  public Object centena() { Object _t=null; int _start=_pos;
    _t=_retrieve("ParserDeNumeroPorExtenso"+"."+"centena"); if (_t!=NOT_MEMOIZED) return _t;
        do {
    _t=ERROR; do{ //or
    { int _p56=_pos; _t=ERROR; do { //and
      _t=ws();
      if (_t==ERROR) break;
      _t=_str("cem");
      if (_t==ERROR) break;
      _t=__act55();
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p56; }
    if (_t!=ERROR) break;

    { int _p58=_pos; _t=ERROR; do { //and
      _t=ws();
      if (_t==ERROR) break;
      _t=_str("novecentos");
      if (_t==ERROR) break;
      _t=__act57();
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p58; }
    if (_t!=ERROR) break;

    { int _p60=_pos; _t=ERROR; do { //and
      _t=ws();
      if (_t==ERROR) break;
      _t=_str("oitocentos");
      if (_t==ERROR) break;
      _t=__act59();
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p60; }
    if (_t!=ERROR) break;

    { int _p62=_pos; _t=ERROR; do { //and
      _t=ws();
      if (_t==ERROR) break;
      _t=_str("setecentos");
      if (_t==ERROR) break;
      _t=__act61();
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p62; }
    if (_t!=ERROR) break;

    { int _p64=_pos; _t=ERROR; do { //and
      _t=ws();
      if (_t==ERROR) break;
      _t=_str("seiscentos");
      if (_t==ERROR) break;
      _t=__act63();
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p64; }
    if (_t!=ERROR) break;

    { int _p66=_pos; _t=ERROR; do { //and
      _t=ws();
      if (_t==ERROR) break;
      _t=_str("quinhentos");
      if (_t==ERROR) break;
      _t=__act65();
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p66; }
    if (_t!=ERROR) break;

    { int _p68=_pos; _t=ERROR; do { //and
      _t=ws();
      if (_t==ERROR) break;
      _t=_str("quatrocentos");
      if (_t==ERROR) break;
      _t=__act67();
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p68; }
    if (_t!=ERROR) break;

    { int _p70=_pos; _t=ERROR; do { //and
      _t=ws();
      if (_t==ERROR) break;
      _t=_str("trecentos");
      if (_t==ERROR) break;
      _t=__act69();
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p70; }
    if (_t!=ERROR) break;

    { int _p72=_pos; _t=ERROR; do { //and
      _t=ws();
      if (_t==ERROR) break;
      _t=_str("duzentos");
      if (_t==ERROR) break;
      _t=__act71();
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p72; }
    if (_t!=ERROR) break;

    { int _p74=_pos; _t=ERROR; do { //and
      _t=ws();
      if (_t==ERROR) break;
      _t=_str("cento");
      if (_t==ERROR) break;
      _t=__act73();
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p74; }
    if (_t!=ERROR) break;
  } while(false);
    _t=_memoize("ParserDeNumeroPorExtenso"+"."+"centena", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="centena"; return _t;
  }
Object __act1(Object s){ return (Integer)s * 1000000; }
Object __act3(Object s){ return 1000000; }
Object __act5(Object c, Object d, Object u){ return (Integer)c + (Integer)d + (Integer)u; }
Object __act7(Object c, Object d, Object u){ return (Integer)c + (Integer)d + (Integer)u; }
Object __act9(Object c, Object d, Object u){ return (Integer)c + (Integer)d; }
Object __act11(Object c, Object d, Object u){ return (Integer)c + (Integer)u; }
Object __act13(Object m, Object s){ return (Integer)m + (Integer)s; }
Object __act15(Object m, Object s){ return (Integer)s * 1000; }
Object __act17(){ return 1000; }
Object __act19(){ return 1; }
Object __act21(){ return 2; }
Object __act23(){ return 3; }
Object __act25(){ return 4; }
Object __act27(){ return 5; }
Object __act29(){ return 6; }
Object __act31(){ return 7; }
Object __act33(){ return 8; }
Object __act35(){ return 9; }
Object __act37(){ return 10; }
Object __act39(){ return 20; }
Object __act41(){ return 30; }
Object __act43(){ return 40; }
Object __act45(){ return 50; }
Object __act47(){ return 60; }
Object __act49(){ return 70; }
Object __act51(){ return 80; }
Object __act53(){ return 90; }
Object __act55(){ return 100; }
Object __act57(){ return 900; }
Object __act59(){ return 800; }
Object __act61(){ return 700; }
Object __act63(){ return 600; }
Object __act65(){ return 500; }
Object __act67(){ return 400; }
Object __act69(){ return 300; }
Object __act71(){ return 200; }
Object __act73(){ return 100; }

  public Object _jump(String r) {
    if (r=="start") return start();
    if (r=="numero") return numero();
    if (r=="milhoes") return milhoes();
    if (r=="simples") return simples();
    if (r=="milhares") return milhares();
    if (r=="milhar") return milhar();
    if (r=="unidade") return unidade();
    if (r=="dezena") return dezena();
    if (r=="centena") return centena();
    return super._jump(r);
  }
  public boolean _has(String r) {
    if (r=="start") return true;
    if (r=="numero") return true;
    if (r=="milhoes") return true;
    if (r=="simples") return true;
    if (r=="milhares") return true;
    if (r=="milhar") return true;
    if (r=="unidade") return true;
    if (r=="dezena") return true;
    if (r=="centena") return true;
    return super._has(r);
  }
}