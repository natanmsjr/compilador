/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.analysis;

import java.util.*;
import compilador.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAlgoritmo(AAlgoritmo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclaracao(ADeclaracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariavelVar(AVariavelVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarVirgula(AVarVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdVariavel(AIdVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVetorVariavel(AVetorVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumeroValor(ANumeroValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumeroRealValor(ANumeroRealValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringValor(AStringValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtribuicaoComandos(AAtribuicaoComandos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALeiaComandos(ALeiaComandos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEscrevaComandos(AEscrevaComandos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeComandos(ASeComandos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAvalieComandos(AAvalieComandos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEnquantoComandos(AEnquantoComandos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARepitaComandos(ARepitaComandos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParaComandos(AParaComandos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParaPassoComandos(AParaPassoComandos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASenaoSeSenaoSe(ASenaoSeSenaoSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACasoPCaso(ACasoPCaso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASenaoCasoSenaoPCaso(ASenaoCasoSenaoPCaso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEExpressaoLogica(AEExpressaoLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOuExpressaoLogica(AOuExpressaoLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEouExpressaoLogica(AEouExpressaoLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANaoExpressaoLogica(ANaoExpressaoLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermoExpressaoLogica(ATermoExpressaoLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParenteseLogicaTermoLogico(AParenteseLogicaTermoLogico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARelacionalTermoLogico(ARelacionalTermoLogico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIgualExpressaoRelacional(AIgualExpressaoRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADiferenteExpressaoRelacional(ADiferenteExpressaoRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorQExpressaoRelacional(AMaiorQExpressaoRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAManorQExpressaoRelacional(AManorQExpressaoRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorIgualExpressaoRelacional(AMaiorIgualExpressaoRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorIgualExpressaoRelacional(AMenorIgualExpressaoRelacional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASomaExpressaoAritmetica(ASomaExpressaoAritmetica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASubtracaoExpressaoAritmetica(ASubtracaoExpressaoAritmetica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenosExpressaoAritmetica(AMenosExpressaoAritmetica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermoExpressaoAritmetica(ATermoExpressaoAritmetica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiplicacaoTermoAritmetico(AMultiplicacaoTermoAritmetico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivisaoTermoAritmetico(ADivisaoTermoAritmetico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFatorTermoAritmetico(AFatorTermoAritmetico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParenteseAritmeticaFatorAritmetico(AParenteseAritmeticaFatorAritmetico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariavelFatorAritmetico(AVariavelFatorAritmetico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValorFatorAritmetico(AValorFatorAritmetico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPonto(TPonto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDoisPontos(TDoisPontos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVirgula(TVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPontoVirgula(TPontoVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBarra(TBarra node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEParentese(TEParentese node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDParentese(TDParentese node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEColchete(TEColchete node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDColchete(TDColchete node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEChave(TEChave node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDChave(TDChave node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMais(TMais node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenos(TMenos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMultiplicacao(TMultiplicacao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDivisao(TDivisao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAtribuicao(TAtribuicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIgual(TIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiferente(TDiferente node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaiorQ(TMaiorQ node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenorQ(TMenorQ node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaiorIgual(TMaiorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenorIgual(TMenorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTE(TE node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOu(TOu node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNao(TNao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEou(TEou node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPrograma(TPrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInicio(TInicio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFim(TFim node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInteiro(TInteiro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReal(TReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaractere(TCaractere node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEscreva(TEscreva node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLeia(TLeia node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSe(TSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEntao(TEntao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSenao(TSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimSe(TFimSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEnquanto(TEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFaca(TFaca node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimEnquanto(TFimEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPara(TPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDe(TDe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPasso(TPasso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimPara(TFimPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAvalie(TAvalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaso(TCaso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimAvalie(TFimAvalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRepita(TRepita node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAte(TAte node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimRepita(TFimRepita node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumero(TNumero node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumeroReal(TNumeroReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConstante(TConstante node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTipo(TTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentario(TComentario node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioAninhado(TComentarioAninhado node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioAninhadoFim(TComentarioAninhadoFim node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioAninhadoCorpo(TComentarioAninhadoCorpo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEstrela(TEstrela node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBarraInclinada(TBarraInclinada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioLinha(TComentarioLinha node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
