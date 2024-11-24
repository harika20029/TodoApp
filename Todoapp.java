import java.util.ArrayList;
import java.util.Scanner;

class Todoapp{
	public static void main(String args[]){
		ArrayList<String> todo=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		int option;
		do{
			System.out.println("\n__Options__");
			
			System.out.println("1.Add Task");
			System.out.println("2.View Task");
			System.out.println("3.Remove Task");
			System.out.println("4.Exit\n");
			
			System.out.print("Enter User Option:");
			option = sc.nextInt();
			
			sc.nextLine();
			if(option == 1){
				System.out.print("Enter task to add :");
				String task=sc.nextLine();
				
				todo.add(task);
			}
			else if(option == 2){
				System.out.println("Your todolist");
				if(todo.size()==0){
					System.out.println("You don't have any task to do");
				}
				for(int i=0;i<todo.size();i++){
					System.out.println((i+1)+" "+todo.get(i));
				}
				
			}
			else if(option==3){
				System.out.print("Enter Task number to remove:");
				int taskno=sc.nextInt();
				if(todo.size()==0 || todo.size() < taskno || taskno <= 0){
					System.out.println("You don't have any task to remove");
				}
				else{
					todo.remove(taskno-1);
					System.out.println("Task removed succesfully!");
				}
			}
			else if(option==4){
				System.out.println("Exit from the application");
			}
			else{
				System.out.println("Invalid");
			}
			
			
			
		}while(option != 4);
	}
}