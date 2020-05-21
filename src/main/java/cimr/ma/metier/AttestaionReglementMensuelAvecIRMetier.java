package cimr.ma.metier;

import cimr.ma.response.ResponseAttestaionReglementMensuelAvecIR;
import cimr.ma.response.ResponseHistoriqueAttestaionReglementMensuelAvecIR;

public interface AttestaionReglementMensuelAvecIRMetier {
	ResponseAttestaionReglementMensuelAvecIR getAttestaionReglementMensuelAvecIR(String numDp, String type,
			String annee, int nombre);

	ResponseHistoriqueAttestaionReglementMensuelAvecIR getHistoriqueAttestaionReglementMensuelAvecIR(String numDp,
			String reference, String dateDebut, String dateFin);
}
