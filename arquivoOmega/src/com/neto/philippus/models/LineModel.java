package com.neto.philippus.models;

public class LineModel 
{
	private int		id;
	private	String 	content;
	private String	bollContent;
	private	int		countCaracters;
	private int		contentVals;
	
	// delete
	/*
		-header
	tp_reg
	tp_dt
	vs_layout
	dt_ger
	dt_init
	dt_end
	hr_ger
	cod_cli
	ls_cnpj
	ls_bandeira
	ls_rede_aut
		-terminal01
	tp_term
	cod_term
	ident_one
	ident_two
	cnpj
	desc
		-transacoe01
	dt_venda
	nsu_loja
	nsu_rede
	cod_aut
	cod_bandeira_loja
	cod_tran_loja
	tp_parc_loja
	num_parc_loja
	val_bruto_loja
	val_liq_loja
	num_card_loja
	satus_loja
	tp_cap_loja
	cod_bandeira_rede
	cod_tran_rede
	num_pac_rede
	val_bruto_rede
	var_liq_rede
	num_card_rede
	satus_rede
	tp_rede
	status_conciliacao
	lote_venda_rede
	id_lote_rede
	id_tran
	ignore
	hr_trans
		-transacao02-3
		---
		-transacao04
	cod_prod_loja
	cod_prod_rede
		-pacelas01
	dt_prev_pag_loja
	dt_pag_loja
	dt_prev_rede	
		-ajuste01
	seq_um
	seq_dois
	tp_ajuste
	lote_ajuste
	id_lote
	id_ajuste
	lote_pag
	obs
	status
	cod_banco
	agencia
	cont_corrente
	detalhe_ajuste
	qtd_reg_venda
	cod_prod
	taxa_adm
		-atencipacao
	val_liq_pac
	dt_antecipacao
	
	 */	
	
	public String getBollContent() {
		return bollContent;
	}
	public void setBollContent(String bollContent) {
		this.bollContent = bollContent;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getCountCaracters() {
		return countCaracters;
	}
	public void setCountCaracters(int countCaracters) {
		this.countCaracters = countCaracters;
	}
	public int getContentVals() {
		return contentVals;
	}
	public void setContentVals(int contentVals) {
		this.contentVals = contentVals;
	}
	
}	//	LineModel