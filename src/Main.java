public class Main {

    public static void main(String[] args) {
        // write your code here

        Course course1 = new Course("C# Course", 1);
        Course course2 = new Course("Java Course", 2);
        Course course3 = new Course("JavaScript Course", 3);

        Course[] courses = {course1, course2, course3};

        for (Course course : courses) {
            System.out.println("Course name :" + course.name + "  ----  Course id :" + course.id);
        }

        CourseManager courseManager = new CourseManager();
        courseManager.startToCourse(course1);
        courseManager.startToCourse(course2);
        courseManager.startToCourse(course3);
        courseManager.addCourseToWishList(course1);
        courseManager.addCourseToWishList(course2);
        courseManager.addCourseToWishList(course3);


    }
}
