package gamepub.db.entity;

import java.util.List;
import javax.persistence.*;


@Entity
@Table(name = "TRADE")
public class Trade {
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    
    @ManyToOne
    @JoinColumn(name = "offeringUser",nullable = false)
    User offeringUser;
    @ManyToOne
    @JoinColumn(name = "receivingUser",nullable = false)
    User receivingUser;        
    
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "offeringTrade")    
    List<OfferingUserTrade> offeringUserTrades;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "receivingTrade")    
    List<ReceivingUserTrade> receivingUserTrades;        
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "offeringGame")    
    List<OfferingUserTrade> offeringUserGame;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "receivingGame")
    List<ReceivingUserTrade> receivingUserGame;
    
    @Column(name = "IS_OPENED")
    Boolean status;
            
    public Trade() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trade)) return false;

        Trade trade = (Trade) o;

        return id == trade.id;

    }

    @Override
    public int hashCode() {
        return id;
    }
    
    /**
     * @return the status
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    

    /**
     * @return the offeringUserGame
     */
    public List<OfferingUserTrade> getOfferingUserGame() {
        return offeringUserGame;
    }

    /**
     * @param offeringUserGame the offeringUserGame to set
     */
    public void setOfferingUserGame(List<OfferingUserTrade> offeringUserGame) {
        this.offeringUserGame = offeringUserGame;
    }

    /**
     * @return the receivingUserGame
     */
    public List<ReceivingUserTrade> getReceivingUserGame() {
        return receivingUserGame;
    }

    /**
     * @param receivingUserGame the receivingUserGame to set
     */
    public void setReceivingUserGame(List<ReceivingUserTrade> receivingUserGame) {
        this.receivingUserGame = receivingUserGame;
    }


    /**
     * @return the offeringUser
     */
    public User getOfferingUser() {
        return offeringUser;
    }

    /**
     * @param offeringUser the offeringUser to set
     */
    public void setOfferingUser(User offeringUser) {
        this.offeringUser = offeringUser;
    }

    /**
     * @return the receivingUser
     */
    public User getReceivingUser() {
        return receivingUser;
    }

    /**
     * @param receivingUser the receivingUser to set
     */
    public void setReceivingUser(User receivingUser) {
        this.receivingUser = receivingUser;
    }

    /**
     * @return the offeringUserTrades
     */
    public List<OfferingUserTrade> getOfferingUserTrades() {
        return offeringUserTrades;
    }

    /**
     * @param offeringUserTrades the offeringUserTrades to set
     */
    public void setOfferingUserTrades(List<OfferingUserTrade> offeringUserTrades) {
        this.offeringUserTrades = offeringUserTrades;
    }

    /**
     * @return the receivingUserTrades
     */
    public List<ReceivingUserTrade> getReceivingUserTrades() {
        return receivingUserTrades;
    }

    /**
     * @param receivingUserTrades the receivingUserTrades to set
     */
    public void setReceivingUserTrades(List<ReceivingUserTrade> receivingUserTrades) {
        this.receivingUserTrades = receivingUserTrades;
    }

  

    
   
}