package uz.jl.ui;

import uz.jl.configs.Session;
import uz.jl.enums.auth.Role;
import uz.jl.enums.settings.Language;
import uz.jl.models.auth.AuthUser;
import uz.jl.ui.components.MenuVal;
import uz.jl.utils.Color;
import uz.jl.utils.Print;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Elmurodov Javohir, Wed 3:24 PM. 12/8/2021
 */
public class MenuUI {

    private static Map<String, String> menus() {
        Map<String, String> menus = new HashMap<>();
        AuthUser user = Session.getInstance().getUser();
        Role role = user.getRole();
        Language language = user.getLanguage();

        if (Role.SUPER_ADMIN.equals(role)) {
            // TODO: 12/8/2021 need to translation
            menus.put("branch.create", MenuVal.BRANCH_CREATE);
            menus.put("branch.delete", MenuVal.BRANCH_DELETE);
            menus.put("branch.block", MenuVal.BRANCH_BLOCK);
            menus.put("branch.unblock", MenuVal.BRANCH_UNBLOCK);
            menus.put("branch.list", MenuVal.BRANCH_LIST);

            menus.put("admin.create", MenuVal.ADMIN_CREATE);
            menus.put("admin.block", MenuVal.ADMIN_BLOCK);
            menus.put("admin.unblock", MenuVal.ADMIN_UNBLOCK);
            menus.put("admin.delete", MenuVal.ADMIN_DELETE);
            menus.put("admin.list", MenuVal.ADMIN_LIST);
        } else if (Role.ADMIN.equals(role)) {
            menus.put("hr.create", MenuVal.HR_CREATE);
            menus.put("hr.block", MenuVal.HR_BLOCK);
            menus.put("hr.unblock", MenuVal.HR_UNBLOCK);
            menus.put("hr.delete", MenuVal.HR_DELETE);
            menus.put("hr.list", MenuVal.HR_LIST);

            menus.put("atm.create", MenuVal.ATM_CREATE);
            menus.put("atm.block", MenuVal.ATM_BLOCK);
            menus.put("atm.unblock", MenuVal.ATM_UNBLOCK);
            menus.put("atm.delete", MenuVal.ATM_DELETE);
            menus.put("atm.list", MenuVal.ATM_LIST);
        } else if (Role.HR.equals(role)) {
            menus.put("employee.create", MenuVal.EMPLOYEE_CREATE);
            menus.put("employee.block", MenuVal.EMPLOYEE_BLOCK);
            menus.put("employee.unblock", MenuVal.EMPLOYEE_UNBLOCK);
            menus.put("employee.delete", MenuVal.EMPLOYEE_DELETE);
            menus.put("employee.list", MenuVal.EMPLOYEE_LIST);
        } else if (Role.EMPLOYEE.equals(role)) {
            menus.put("client.create", MenuVal.CLIENT_CREATE);
            menus.put("client.block", MenuVal.CLIENT_BLOCK);
            menus.put("client.unblock", MenuVal.CLIENT_UNBLOCK);
            menus.put("client.delete", MenuVal.CLIENT_DELETE);
            menus.put("client.list", MenuVal.CLIENT_LIST);

            menus.put("give.cards", MenuVal.GIVE_CARDS);
            menus.put("atm.update", MenuVal.UPDATE_ATM);
            menus.put("atm.cassette.block", MenuVal.BLOCK_ATM_CASSETTE);
            menus.put("atm.cassette.unblock", MenuVal.UNBLOCK_ATM_CASSETTE);
        }
        if (!Role.ANONYMOUS.equals(role)) {
            menus.put("card.order", MenuVal.CLIENT_ORDER_CARD);
            menus.put("logout", MenuVal.LOGOUT);
            menus.put("profile", MenuVal.PROFILE);
        }
        if (Role.ANONYMOUS.equals(role)) {
            menus.put("login", MenuVal.LOGIN);
        }
        menus.put("atm.service", MenuVal.ATM_SERVICES);
        menus.put("quit", MenuVal.QUIT);
        return menus;
    }

    public static void show() {
        menus().forEach((k, v) -> Print.println(Color.GREEN, (k + " - > " + v)));
    }

}
