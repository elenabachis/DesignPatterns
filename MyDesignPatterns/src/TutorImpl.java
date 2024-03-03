public class TutorImpl implements Tutor{

    public TutorImpl(Teacher teacher) {
        this.teacher = teacher;
    }

    public Teacher teacher;


    @Override
    public void teachesLikeTeacher() {
        teacher.teaches();
    }
}
