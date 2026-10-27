    import java.util.Scanner;
    public class todo {
    public static void main(String[] args)
    {
        int i,choice=0,count=0;
        String str;
        String arr[]=new String[10];
        boolean completed[] = new boolean[10];
        Scanner sc=new Scanner(System.in);
        while (choice!=5) {
            System.out.println("\n======To-Do-List choice=======");
            System.out.println("1. Add Tasks");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete a Task");
            System.out.println("4. Mark Task as Completed");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            choice=sc.nextInt();
            sc.nextLine();
            if(choice==1)
            {
                System.out.println("Enter your task to add in list");
                System.out.println("How many you want to add in list");
                int num=sc.nextInt();
                sc.nextLine();
                if(num>10-count)
                {
                    System.out.println("Maximum 10 tasks allowed.\nYou can add only " + (10-count) + " more tasks.");
                }
                else if(num<=0)
                    {
                        System.out.println("Please enter a number greater than 0");
                    }
                else
                {
                for( i=0;i<num;i++)
                {
                    System.out.print((count+1) + ". ");
                    str=sc.nextLine();
                    arr[count]=str;
                    count++;
                }
            }
        }
            else if(choice==2)
            {
                System.out.println("View your task selected");
                if(count==0)
                {
                    System.out.println("Your task list is empty. No tasks have been added yet.");
                }
                for(i=0;i<count;i++)
                {
                    System.out.println((i+1) + ". " + arr[i]);
                }
            }
            else if(choice==3)
            {
                System.out.println("Delete task");
                if(count==0)
                {
                    System.out.println("Task list empty");
                }
                else 
                {
                for(i=0;i<count;i++)
                {
                    System.out.println((i+1) + ". " + arr[i]);
                }
                System.out.println("Enter task number to delete");
                int delete=sc.nextInt();
                sc.nextLine();
                if(delete<=0||delete>count)
                {
                    System.out.println("Task number does not exist. Please try again.");
                }
                else
                {
                for(i=delete-1;i<count-1;i++)
                {
                    arr[i]=arr[i+1];
                    completed[i]=completed[i+1];
                }
                count-=1;
                for(i=0;i<count;i++)
                {
                    System.out.println((i+1) + ". " + arr[i]);
                }
                }
                 }
            }
            else if(choice==4)
            {
                System.out.println("Mark task");
                 if(count==0)
                {
                    System.out.println("Task list empty");
                }
                else 
                {
                for(i=0;i<count;i++)
                {
                    System.out.println((i+1) + ". " + arr[i]);
                }
                System.out.println("Enter the task number to mark as completed");
                int mark=sc.nextInt();
                sc.nextLine();
                if(mark<=0||mark>count)
                {
                    System.out.println("Task number does not exist. Please try again.");
                }
                else
                {
                if(completed[mark-1] == true)
                {
                     System.out.println("Task is already completed.");
                }
                else
                {
                    completed[mark-1] = true;
                    arr[mark-1] = arr[mark-1] + " (Completed)";
                    System.out.println("Task marked as completed successfully.");
                }
               }
               }
            }
            else if(choice==5)
            {
                System.out.println("Exit");
            }
            else
            {
                System.out.println("Invalid choice");
            }
        }
    }
    }