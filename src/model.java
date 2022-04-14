import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class model {
    private ArrayList<meeps> meepsArrayList;
    private JList list;
    private DefaultListModel<String> listModel = new DefaultListModel<>();
    private Font listFont = new Font("Helvetica", Font.BOLD, 15);

    public model() {
        meepsArrayList = new ArrayList<>();
        for (int i = 0; i < meepsArrayList.size(); i++) {
            addmeepsToArrayList(1, "070",  "Länge Sedan","Senare",2);
        }
        initizializeViewList();
    }

    public void addmeepsToArrayList(int id, String body, String created_at, String updated_at, int user_id) {
        meepsArrayList.add(new meeps(id,body,created_at,updated_at,user_id));
    }

    public void initizializeViewList() {
        for (meeps meeps : meepsArrayList) {
            listModel.addElement(meeps.listToString());
        }
        list = new JList(listModel);
        list.setFixedCellWidth(40);
        list.setFixedCellHeight(40);
        list.setFont(listFont);
        list.setSelectionBackground(Color.GRAY);
    }

    public void updateViewList() {
        clearListModel();
        for (meeps meeps : meepsArrayList) {
            listModel.addElement(meeps.listToString());
        }
    }

    public void clearListModel() {
        listModel.clear();
    }

    public JList getList() {
        return list;
    }

    public int randomNumber(int min, int max) {
        return (int) Math.floor(Math.random()*((max+1)-min)+min);
    }

    public long getDateInEpoch(String string) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {date = df.parse(string);} catch (ParseException e) {e.printStackTrace();}
        long epoch = date.getTime();
        return epoch;
    }
}
