import java.util.ArrayList;

public class ProjectClass {
    private String name;
    private String description;
    private double initialCost;

    public void elevatorPitch(){
        System.out.printf("%s ($%.2f): %s\n", name, initialCost, description);
    }

    public ProjectClass() {
        this.name = "empty";
        this.description = "empty";
        this.initialCost = 100;
    }

    public ProjectClass(String name){
        this.name = name;
        this.description = "empty";
        this.initialCost = 100;
    }

    public ProjectClass(String name, String description){
        this.name = name;
        this.description = description;
        this.initialCost = 100;
    }

    public ProjectClass(String name, String description, double initialCost){
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }

    public ProjectClass(String name, double initialCost){
        this.name = name;
        this.description = "empty";
        this.initialCost = 100;
    }

    public void addName(String name){
        this.name = name;
    }

    public void addDesc(String description){
        this.description = description;
    }

    public void addCost(double initialCost){
        this.initialCost = initialCost;
    }

    public String getName(){
        return this.name;
    }

    public String getDesc(){
        return this.description;
    }

    public double getCost(){
        return this.initialCost;
    }
}

class Portfolio{
    // private String[] projectClass;
    ArrayList<ProjectClass> list = new ArrayList<ProjectClass>();

    public void addProject(ProjectClass project){
        this.list.add(project);
    }

    public void getPortfolioCost(){
        double totalCost = 0;
        for (int i = 0; i < list.size(); i++){
            totalCost = totalCost + list.get(i).getCost();
        }
        System.out.printf("Total Portfolio Cost: $%.2f\n", totalCost);
    }

    public void showPortfolio(){
        for (int i = 0; i < list.size(); i++){
            System.out.printf("%d. %s ($%.2f): %s\n", i+1, list.get(i).getName(), list.get(i).getCost(), list.get(i).getDesc());
        }
}
}
