package cimr.ma.response;

import cimr.ma.common.StatusBean;
import cimr.ma.dao.AttestaionReglementMensuelAvecIRDto;

public class ResponseAttestaionReglementMensuelAvecIR {
	private StatusBean statusbean;
	private AttestaionReglementMensuelAvecIRDto attestaionReglementMensuelAvecIR;

	public StatusBean getStatusbean() {
		return statusbean;
	}

	public void setStatusbean(StatusBean statusbean) {
		this.statusbean = statusbean;
	}

	public AttestaionReglementMensuelAvecIRDto getAttestaionReglementMensuelAvecIR() {
		return attestaionReglementMensuelAvecIR;
	}

	public void setAttestaionReglementMensuelAvecIR(
			AttestaionReglementMensuelAvecIRDto attestaionReglementMensuelAvecIR) {
		this.attestaionReglementMensuelAvecIR = attestaionReglementMensuelAvecIR;
	}

	public ResponseAttestaionReglementMensuelAvecIR() {
		super();
		// TODO Auto-generated constructor stub
	}

}
