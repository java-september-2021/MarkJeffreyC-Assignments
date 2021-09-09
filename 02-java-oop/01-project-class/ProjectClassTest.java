import java.util.ArrayList;
import java.util.Arrays;

public class ProjectClassTest {
    public static void main(String[] args){

        ProjectClass project1 = new ProjectClass("project1");
        ProjectClass project3 = new ProjectClass("project3", 250);
        ProjectClass project4 = new ProjectClass("project4", "Project 2 description", 300);
        ProjectClass project2 = new ProjectClass("project2", "Project 2 description");

        project1.addName("project 1 update");
        project3.addDesc("This is a test");
        project2.addCost(150);
        System.out.println(project4.getName());
        System.out.println(project3.getDesc());
        System.out.println(project1.getCost());

        project1.elevatorPitch();
        project2.elevatorPitch();
        project3.elevatorPitch();
        project4.elevatorPitch();

        Portfolio portfolioList = new Portfolio();
        portfolioList.addProject(project1);
        portfolioList.addProject(project2);

        portfolioList.getPortfolioCost();
        portfolioList.showPortfolio();
    }
}
