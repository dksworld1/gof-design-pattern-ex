package desing.pattern.behavior.mediator;

import javax.swing.JButton;
import java.awt.event.ActionListener;

public class BtnSearch extends JButton implements Command {

    Mediator med;

    BtnSearch(ActionListener al, Mediator m) {
        super("Search");
        addActionListener(al);
        med = m;
        med.registerSearch(this);
    }

    public void execute() {
        med.search();
    }

}