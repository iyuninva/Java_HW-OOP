package solid.dip;

import java.util.List;

public class DisplayReport implements AbstractPrintReport {

    @Override
    public void output(List<ReportItem> items) {
        System.out.println("Вывод на экран");
    }
    
}
