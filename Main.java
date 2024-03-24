import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EducationalGroup group1 = new EducationalGroup(15, 142, "Счетоводы");
        EducationalGroup group2 = new EducationalGroup(15, 142, "Пчеловоды");
        EducationalGroup group3 = new EducationalGroup(18, 112, "Кодовики");
        EducationalGroup group4 = new EducationalGroup(19, 115, "Кадровики");
        EducationalGroup group5 = new EducationalGroup(21, 187, "Учетчики");
        Strim listGroup = new Strim();
        listGroup.addEducationalGroup(group1);
        listGroup.addEducationalGroup(group2);
        listGroup.addEducationalGroup(group3);
        listGroup.addEducationalGroup(group4);
        listGroup.addEducationalGroup(group5);
        for (EducationalGroup group : listGroup) {
            System.out.println(group);
        }
        System.out.println();
        
        for (EducationalGroup group : getCompeNameGroup(listGroup)) {
            System.out.println(group);
        }

        
        public static List<EducationalGroup> getCompeNameGroup(Strim listGroup){
        List<EducationalGroup> eduGroup = new ArrayList<>(listGroup.getEduGroup());
        eduGroup.sort(new Comparator<EducationalGroup>() {

            @Override
            public int compare(EducationalGroup o1, EducationalGroup o2) {
                return 0;
            }
            
        });
    }
    }
}
