package cimr.ma.response;

import java.util.List;

import cimr.ma.common.StatusBean;
import cimr.ma.dao.AttestaionReglementMensuelAvecIRDto;

public class ResponseHistoriqueAttestaionReglementMensuelAvecIR {
	private StatusBean statusbean;
	private List<AttestaionReglementMensuelAvecIRDto> listAttestaionReglementMensuelAvecIR;

	public StatusBean getStatusbean() {
		return statusbean;
	}

	public void setStatusbean(StatusBean statusbean) {
		this.statusbean = statusbean;
	}

	public List<AttestaionReglementMensuelAvecIRDto> getListAttestaionReglementMensuelAvecIR() {
		return listAttestaionReglementMensuelAvecIR;
	}

	public void setListAttestaionReglementMensuelAvecIR(
			List<AttestaionReglementMensuelAvecIRDto> listAttestaionReglementMensuelAvecIR) {
		this.listAttestaionReglementMensuelAvecIR = listAttestaionReglementMensuelAvecIR;
	}

	public ResponseHistoriqueAttestaionReglementMensuelAvecIR() {
		super();
		// TODO Auto-generated constructor stub
	}

}
