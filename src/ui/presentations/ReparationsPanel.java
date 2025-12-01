package ui.presentations;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
//
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;


public class ReparationsPanel extends JPanel {
	//
	private JTable table;
	private DefaultTableModel tableModel;
	//
	private JTextField txtRecherche;
	private JComboBox<String> cbStatut;
	private JButton btnRechercher;
	private JButton btnAjouter;
	//
	private JButton btnModifier;
	private JButton btnAnnuler;
	private JButton btnDetail;
	//
	public ReparationsPanel() {
		setLayout(new BorderLayout());
		//
		initTopBar();
	}
	//
	private void initTopBar() {
		//
		JPanel panelTop = new JPanel(new BorderLayout());
		// Partie gauche : recherche + filtre
		JPanel panelSearch = new JPanel(new FlowLayout(FlowLayout.LEFT));
		txtRecherche = new JTextField(15);
		cbStatut = new JComboBox<>(new String[] {
				"Tous", "En cours", "En attente pièces", "Terminée", "Annulée", "Livrée"
		});
		btnRechercher = new JButton("Rechercher");
		//
		panelSearch.add(new JLabel("Recherche :"));
		panelSearch.add(txtRecherche);
		panelSearch.add(new JLabel("Statut :"));
		panelSearch.add(cbStatut);
		panelSearch.add(btnRechercher);
		// Partie droite : bouton Ajouter
		JPanel panelAdd = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		btnAjouter = new JButton("+ Ajouter");
		panelAdd.add(btnAjouter);
		//
		panelTop.add(panelSearch, BorderLayout.CENTER);
		panelTop.add(panelAdd, BorderLayout.EAST);
		btnAjouter.addActionListener(e -> {
			JOptionPane.showMessageDialog(
					this,
					"Formulaire -- Ajout réparation",
					"Ajouter réparation",
					JOptionPane.INFORMATION_MESSAGE
					);
		});
	}
	//
	//
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Gestion des réparations");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(new ReparationsPanel());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
	}
}
