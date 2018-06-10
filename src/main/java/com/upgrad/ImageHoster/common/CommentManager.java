package com.upgrad.ImageHoster.common;

import com.upgrad.ImageHoster.model.Comment;
import com.upgrad.ImageHoster.model.Image;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


import java.util.List;

public class CommentManager extends SessionManager{

    public List<Comment> getAllComments() {
        Session session = openSession();
        List<Comment> comments = session.createCriteria(Comment.class).list();
        commitSession(session);

        return comments;
    }
    public Comment getById(int id)
    {
        Session session = openSession();

        try {
            Comment comment = (Comment)session.createCriteria(Comment.class)
                    .add(Restrictions.eq("id", id))
                    .uniqueResult(); // retrieves only 1 image
            commitSession(session);

            return comment;
        } catch(HibernateException e) {
            System.out.println("unable to retrieve an image from database by its title");
        }

        return null;
    }
}
