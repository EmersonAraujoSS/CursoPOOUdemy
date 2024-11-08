package LogicaDeProgramacao.Composicao.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    //ATRIBUTOS
    private Date moment;
    private String title;
    private String content;
    private Integer likes;
    private List<Comment> commentList = new ArrayList<>();

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");


    //CONSTRUTOR
    public Post() {
    }

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }


    //MÉTODOS
    public void addComment(Comment comment) {
        commentList.add(comment);
    }

    public void removeComment(Comment comment) {
        commentList.remove(comment);
    }


    //MÉTODOS ESPECIAIS
    public Date getMoment() {
        return moment;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Integer getLikes() {
        return likes;
    }
    public void setLikes(Integer likes) {
        this.likes = likes;
    }
    public List<Comment> getCommentList() {
        return commentList;
    }


    public String toString() { //StringBuilder = serve para quando vc tiver que montar um string muito grande, a partir de vários pequenos, porque essa classe é otimizada para isso
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n"); //append = append significa acrescentar no final
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments:\n");
        for (Comment c : commentList) {
            sb.append(c.getText() + "\n");
        }

        return sb.toString();
    }
}
