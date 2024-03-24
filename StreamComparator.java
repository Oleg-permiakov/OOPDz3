import java.util.Comparator;

public class StreamComparator implements Comparator<EducationalGroup>{

    @Override
    public int compare(EducationalGroup o1, EducationalGroup o2) {
        return o1.getGroupName().compareTo(o2.getGroupName());
    }
    
}
