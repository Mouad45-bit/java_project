package model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Reparation {
	private int id;
	private String dateDepot;
	private String client;
	private String objet;
	private String statut;
	private double avance;
	private double reste;
}
