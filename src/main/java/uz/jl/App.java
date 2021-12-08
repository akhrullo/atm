package uz.jl;

import uz.jl.ui.BranchUI;
import uz.jl.ui.MenuUI;
import uz.jl.ui.components.MenuVal;
import uz.jl.utils.Color;
import uz.jl.utils.Input;
import uz.jl.utils.Print;

import static uz.jl.ui.components.MenuVal.*;

/**
 * @author Elmurodov Javohir, Mon 6->14 PM. 11/29/2021
 */
public class App {

    public static void main(String[] args) {
        MenuUI.show();
        String choice = Input.getStr("?->");
        switch (choice.toUpperCase()) {
            case BRANCH_CREATE -> BranchUI.create();
            case BRANCH_BLOCK -> BranchUI.block();
            case BRANCH_UNBLOCK -> BranchUI.unblock();
            case BRANCH_DELETE -> BranchUI.delete();
            case BRANCH_LIST -> BranchUI.list();

            case ADMIN_CREATE -> AdminUI.create();
            case ADMIN_BLOCK -> AdminUI.block();
            case ADMIN_UNBLOCK -> AdminUI.unblock();
            case ADMIN_DELETE -> AdminUI.delete();
            case ADMIN_LIST -> AdminUI.list();

            case HR_CREATE -> HrUI.create();
            case HR_BLOCK -> HrUI.block();
            case HR_UNBLOCK -> HrUI.unblock();
            case HR_DELETE -> HrUI.delete();
            case HR_LIST -> HrUI.list();

            case EMPLOYEE_CREATE -> EmployeeUI.create();
            case EMPLOYEE_BLOCK -> EmployeeUI.block();
            case EMPLOYEE_UNBLOCK -> EmployeeUI.unblock();
            case EMPLOYEE_DELETE -> EmployeeUI.delete();
            case EMPLOYEE_LIST -> EmployeeUI.list();


            case CLIENT_CREATE -> ClientUI.create();
            case CLIENT_BLOCK -> ClientUI.block();
            case CLIENT_UNBLOCK -> ClientUI.unblock();
            case CLIENT_DELETE -> ClientUI.delete();
            case CLIENT_LIST -> ClientUI.list();
            case CLIENT_ORDER_CARD -> ClientUI.orderCard();

            case ATM_CREATE -> AtmUI.create();
            case ATM_BLOCK -> AtmUI.block();
            case ATM_UNBLOCK -> AtmUI.unblock();
            case ATM_DELETE -> AtmUI.delete();
            case ATM_LIST -> AtmUI.list();
            case ATM_SERVICES -> AtmUI.services();

            case LOGIN -> AuthUI.login();
            case LOGOUT -> AuthUI.logout();
            case PROFILE -> AuthUI.profile();
            case QUIT -> {
                AuthUI.quit();
                return;
            }

            default -> // TODO: 12/8/2021 translate
                    Print.println(Color.RED, "Wrong Choice");
        }
        main(args);
    }

}
