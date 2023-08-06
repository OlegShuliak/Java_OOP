public class Group {
    private int groupId;
    private int groupCourse;
    private String groupSpecialization;

    public void Group(int groupId, int groupCourse, String groupSpecialization){
        this.groupId = groupId;
        this.groupCourse = groupCourse;
        this.groupSpecialization = groupSpecialization;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
    public int getGroupId() {
        return groupId;
    }

    public void setGroupCourse(int groupCourse) {
        this.groupCourse = groupCourse;
    }
    public int getGroupCourse() {
        return groupCourse;
    }

    public void setGroupSpecialization(String groupSpecialization) {
        this.groupSpecialization = groupSpecialization;
    }
    public String getGroupSpecialization() {
        return groupSpecialization;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupId=" + groupId +
                ", groupCourse=" + groupCourse +
                ", groupSpecialization='" + groupSpecialization + '\'' +
                '}';
    }
}
