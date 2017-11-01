package beans;

import dao.UserDAO;
import model.User;

import javax.ejb.EJB;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * Created by BigBadVoodooDaddy on 01.11.2017.
 */
@SessionScoped
@Named
public class ProjectBean implements Serializable{
    @EJB
    UserDAO userDAO;

    /**
     *
     * @return List<User>
     *     возвращает список всех пользователей
     */
    public List<User> getUsersList() {
        return userDAO.findAll();
    }
}
