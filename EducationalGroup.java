
public class EducationalGroup {
    private int idGroup;
    private int volume;
    private String groupName;

    public int getIdGroup() {
            return idGroup;
        }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public EducationalGroup(int idGroup, int volume, String groupName) {
        this.idGroup = idGroup;
        this.volume = volume;
        this.groupName = groupName;
        }

    @Override
    public String toString() {
        return "IdGroup " + idGroup + " Количество студентов в группе = " + volume +
                    " Название групп - " + groupName;
    }
}
