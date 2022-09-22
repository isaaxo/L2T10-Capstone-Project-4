/* The program below captures information about a building project as well as
the architect's, customer's and constructor's details involved in the project*/

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Poised {

    public static void main(String[] args) {

        // Array for storing data
        ArrayList<Project> CapturedData = new ArrayList<Project>();

        System.out.println("************Poised Project Management*************");

        while (true) {

            // Displaying menu to the user
            System.out.println("Please make a selection from the menu:" + "\n1. Create a new project:"
                    + "\n2. Change the due date of the project:" + "\n3. Change the total number of the fee paid:"
                    + "\n4. Update contractors contact details");

            // Initializing the scanner
            Scanner input = new Scanner(System.in);
            String userChoice = input.nextLine();

            // Creating a project
            if (userChoice.equals("1")) {
                int typedProjectNumber = 0;
                while (true) {
                    try {
                        System.out.println("Enter Project Number:");
                        typedProjectNumber = input.nextInt();
                        input.nextLine();
                        break;

                    } catch (Exception e) {
                        System.out.println("Wrong information format provided, try again!");
                        input.next();
                    }
                }
                System.out.println("Enter Project Name: ");
                String typedProjectName = input.nextLine();
                System.out.println("Enter building type: ");
                String typedBuildingType = input.nextLine();
                System.out.println("Enter project physical address: ");
                String typedProjectAddress = input.nextLine();
                int typedErfNumber = 0;

                while (true) {
                    try {
                        System.out.println("Enter Erf Number: ");
                        typedErfNumber = input.nextInt();
                        input.nextLine();
                        break;
                    } catch (Exception e) {
                        System.out.println("Wrong information format provided, try again!");
                        input.next();
                    }
                }
                Double typedTotalFee = 0.0;
                while (true) {
                    try {
                        System.out.println("Enter project total fee in (numerical format): ");
                        typedTotalFee = input.nextDouble();
                        input.nextLine();
                        break;
                    } catch (Exception e) {
                        System.out.println("Wrong information format provided, try again!");
                        input.next();
                    }
                }
                Double typedTotalPaid = 0.0;
                while (true) {
                    try {
                        System.out.println("Enter amount paid by customer (numerical format): ");
                        typedTotalPaid = input.nextDouble();
                        input.nextLine();
                        break;
                    } catch (Exception e) {
                        System.out.println("Wrong information format provided, try again!");
                        input.next();
                    }
                }
                System.out.println("Enter due date e.g (24 September 2022): ");
                String typedProjectDeadline = input.nextLine();
                String projectCompleted = ("No");
                Date defaultDate = null;

                // Architect information
                System.out.println("Enter Architect name:");
                String architectName = input.nextLine();
                System.out.println("Enter Architect surname:");
                String architectSurname = input.nextLine();
                int architectPhoneNumber = 0;
                while (true) {
                    try {
                        System.out.println("Enter Architect phone number");
                        architectPhoneNumber = input.nextInt();
                        input.nextLine();
                        break;
                    } catch (Exception e) {
                        System.out.println("Wrong information format provided, try again!");
                        input.next();
                    }
                }
                System.out.println("Enter Architect email address:");
                String architectEmail = input.nextLine();
                System.out.println("Enter Architect address:");
                String architectAddress = input.nextLine();

                // Customer information
                System.out.println("Enter Customer name:");
                String customerName = input.nextLine();
                System.out.println("Enter Customer surname:");
                String customerSurname = input.nextLine();
                int customerPhoneNumber = 0;
                while (true) {
                    try {
                        System.out.println("Enter Customer number:");
                        customerPhoneNumber = input.nextInt();
                        input.nextLine();
                        break;
                    } catch (Exception e) {
                        System.out.println("Wrong information format provided, try again!");
                        input.next();
                    }
                }
                System.out.println("Enter Customer email address");
                String customerEmail = input.nextLine();
                System.out.println("Enter Customer address");
                String customerAddress = input.nextLine();

                // Contractor information
                System.out.println("Enter Contractor name");
                String contractorName = input.nextLine();
                System.out.println("Enter Contractor surname:");
                String contractorSurname = input.nextLine();
                int contractorNumber = 0;
                while (true) {
                    try {
                        System.out.println("Enter Contractor number:");
                        contractorNumber = input.nextInt();
                        input.nextLine();
                        break;
                    } catch (Exception e) {
                        System.out.println("Wrong information format provided, try again!");
                        input.next();
                    }
                }
                System.out.println("Enter Contractor email address:");
                String contractorEmail = input.nextLine();
                System.out.println("Enter Contractor address:");
                String contractorAddress = input.nextLine();

                // Creating Architect
                Person Architect = new Person(architectName, architectSurname, architectPhoneNumber, architectEmail,
                        architectAddress);

                // Creating Customer
                Person Customer = new Person(customerName, customerSurname, customerPhoneNumber, customerEmail,
                        customerAddress);

                // Creating Contractor
                Person Contractor = new Person(contractorName, contractorSurname, contractorNumber, contractorEmail,
                        contractorAddress);

                // Creating the project
                Project newProject = new Project(typedProjectNumber, typedProjectName, typedBuildingType,
                        typedProjectAddress, typedErfNumber, typedTotalFee, typedTotalPaid, typedProjectDeadline,
                        Architect, Customer, Contractor);

                CapturedData.add(newProject);

                // Displaying information to the user
                System.out.println("\nNew project has been created!");
                System.out.println(newProject.toString());

                // If user does not enter project name then the surname of the client is used as the project's name
                if (typedProjectName.equals("")) {
                    newProject.setProjectName(typedBuildingType + " " + customerSurname);
                }
            }

            // Changing due date of the project
            else if (userChoice.equals("2")) {

                // Asking user which project they want to change the deadline
                int deadlineIndex = 0;
                while (true) {
                    try {
                        System.out.println("Please enter project you want to edit by index:");
                        deadlineIndex = input.nextInt();
                        input.nextLine();
                        deadlineIndex = deadlineIndex - 1;
                        break;
                    } catch (Exception e) {
                        System.out.println("Wrong information format provided, try again!");
                        input.next();
                    }
                }
                System.out.println("Enter new project deadline date for example 15 July 2020:");
                String newDeadline = input.nextLine();
                // Setting new deadline in array
                CapturedData.get(deadlineIndex).setDeadline(newDeadline);
                // Displaying updated project to user
                System.out.println(CapturedData.get(deadlineIndex).toString());
            }

            // Changing the total number of the fee paid
            else if (userChoice.equals("3")) {

                //Asking user which project they want to change the fee paid for
                int feePaidIndex = 0;
                while(true) {
                    try {
                        System.out.println("Please enter project you want to edit by index:");
                        feePaidIndex = input.nextInt();
                        input.nextLine();
                        feePaidIndex = feePaidIndex - 1;
                        break;
                    }
                    catch(Exception e) {
                        System.out.println("Wrong information format provided, try again!:");
                        input.next();
                    }
                }

                Double newFeePaid = 0.0;
                while (true) {
                    try {
                        System.out.println("Enter new fee paid by the customer:");
                        newFeePaid = input.nextDouble();
                        input.nextLine();

                        // Setting the amount paid in an array
                        CapturedData.get(feePaidIndex).setAmountPaid(newFeePaid);
                        break;
                    }

                    catch (Exception e) {
                        System.out.println("Wrong information format provided, try again!:");
                        input.next();
                    }
                }

                // Displaying updated project to the user
                System.out.println(CapturedData.get(feePaidIndex).toString());
            }

            // Updating contractor's contact details
            else if (userChoice.equals("4")) {

                // Asking user which project contractor they want to edit
                int contractorIndex = 0;
                while(true) {
                    try {
                        System.out.println("Please enter project you want to edit by index:");
                        contractorIndex = input.nextInt();
                        input.nextLine();
                        contractorIndex = contractorIndex - 1;
                        break;
                    }
                    catch(Exception e) {
                        System.out.println("Wrong information format provided, try again!:");
                        input.next();
                    }
                }

                // Changing the contractor's telephone number
                int newPhoneNumber = 0;
                while (true) {
                    try {
                        System.out.println("Enter new contractors phone number:");
                        newPhoneNumber = input.nextInt();
                        input.nextLine();
                        CapturedData.get(contractorIndex).Contractor.setTelephoneNumber(newPhoneNumber);
                        break;
                    } catch (Exception e) {
                        System.out.println("Wrong information format provided, try again!:");
                        input.next();
                    }
                }

                // Changing the contractor's email address
                System.out.println("Enter new contractors email address:");
                String newEmailAddress = input.nextLine();
                CapturedData.get(contractorIndex).Contractor.setEmailAddress(newEmailAddress);

                // Displaying updated contractor information to user
                System.out.println(CapturedData.get(contractorIndex).Contractor.toString());

            }

        }

    }
}

