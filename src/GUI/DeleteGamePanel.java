package GUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;


/**
 * Created by Greenmeister on 27/11/15.
 */


        /**Creating JPanel class with J Components**/
public class DeleteGamePanel extends JPanel {
    private JLabel lblDeleteGame;
    private JLabel lblInsertGameId;
    private JTextField gameID;
    private JButton btnDelete;
    private JButton btnBack;
    private JLabel Background;


     /**Creating the panel and adding J components to it**/
    public DeleteGamePanel() {

        /**Setting Names on the components, Setting their font and setting their bounds adding them to panel**/


        setLayout(null);
        setSize(700, 550);

        lblDeleteGame = new JLabel("DELETE GAME");
        lblDeleteGame.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblDeleteGame.setBounds(297, 49, 127, 33);
        add(lblDeleteGame);

        lblInsertGameId = new JLabel("Please type Game ID to Delete Game");
        lblInsertGameId.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblInsertGameId.setBounds(232, 132, 263, 33);
        add(lblInsertGameId);

        gameID = new JTextField();
        gameID.setBounds(243, 178, 236, 39);
        add(gameID);
        gameID.setColumns(10);

        btnDelete = new JButton("Delete");
        btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnDelete.setBounds(274, 368, 171, 41);
        add(btnDelete);

        btnBack = new JButton("Back");
        btnBack.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnBack.setBounds(274, 475, 171, 41);
        add(btnBack);

        /**Adding background image**/

        try /** tries to load image **/
        {
            BufferedImage img = ImageIO.read(this.getClass().getResource("/Pictures/delete.jpg"));
            Background = new JLabel("");
            Background.setIcon(new ImageIcon(img));
            Background.setBounds(0, 0, 700, 550);
            add(Background);
        }
        catch (IOException ex) {

        }

    }

            /**getters  for the controller class**/

    public int getGameID() {
        return Integer.parseInt(gameID.getText());
    }

    public JButton getBtnDelete() {
        return btnDelete;
    }

    public JButton getBtnBack() {
        return btnBack;
    }

            /**Adding actionlistner to Jbutton**/
    public void addActionListener(ActionListener event) {

        btnDelete.addActionListener(event);
        btnBack.addActionListener(event);


    }


}
