import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Strim implements Iterable<EducationalGroup> {
   private List<EducationalGroup> eduGroup;
   
   
   public Strim(List<EducationalGroup> eduGroup) {
       this.eduGroup = eduGroup;
    }
    
    public Strim() {
        eduGroup = new ArrayList<>();
    }
    
    public void addEducationalGroup(EducationalGroup group){
        eduGroup.add(group);
    }
    
    public List<EducationalGroup> getEduGroup() {
    return eduGroup;
    }

    @Override
    public Iterator<EducationalGroup> iterator() {
        return new GroupIterator(this);
    }

    
}
