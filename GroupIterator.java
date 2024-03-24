import java.util.Iterator;
import java.util.List;

public class GroupIterator implements Iterator<EducationalGroup>{
    private List<EducationalGroup> eduGroup;
    private int count;

    public GroupIterator(Strim listGroup) {
        this.eduGroup = listGroup.getEduGroup();
    }

    @Override
    public boolean hasNext() {
        return count < eduGroup.size();
    }

    @Override
    public EducationalGroup next() {
        if (!hasNext()) {
            return null;
        }
        return eduGroup.get(count++);
    }


}
