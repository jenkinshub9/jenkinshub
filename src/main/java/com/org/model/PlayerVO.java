 
package com.org.model;
import java.util.Date;
 
public class PlayerVO 
{
public int getPlayerId() {
    return playerId;
}
public void setPlayerId(int playerId) {
    this.playerId = playerId;
}
public String getPlayerName() {
    return playerName;
}
public void setPlayerName(String playerName) {
    this.playerName = playerName;
}
public String getPlayertype() {
    return playertype;
}
public void setPlayertype(String playertype) {
    this.playertype = playertype;
}
public int getNoOfCenturies() {
    return noOfCenturies;
}
public void setNoOfCenturies(int noOfCenturies) {
    this.noOfCenturies = noOfCenturies;
}
public int getNoOfHalfCenturies() {
    return noOfHalfCenturies;
}
public void setNoOfHalfCenturies(int noOfHalfCenturies) {
    this.noOfHalfCenturies = noOfHalfCenturies;
}
public int getNoOfCatches() {
    return noOfCatches;
}
public void setNoOfCatches(int noOfCatches) {
    this.noOfCatches = noOfCatches;
}
public String getContactNumber() {
    return contactNumber;
}
public void setContactNumber(String contactNumber) {
    this.contactNumber = contactNumber;
}
public Date getDateOfRegistration() {
    return dateOfRegistration;
}
public void setDateOfRegistration(Date dateOfRegistration) {
    this.dateOfRegistration = dateOfRegistration;
}
public int getNoOfPointsOwned() {
    return noOfPointsOwned;
}
public void setNoOfPointsOwned(int noOfPointsOwned) {
    this.noOfPointsOwned = noOfPointsOwned;
}
private int playerId;
@Override
public String toString() {
    return "Player [playerId=" + playerId + ", playerName=" + playerName + ", playertype=" + playertype
            + ", noOfCenturies=" + noOfCenturies + ", noOfHalfCenturies=" + noOfHalfCenturies + ", noOfCatches="
            + noOfCatches + ", contactNumber=" + contactNumber + ", dateOfRegistration=" + dateOfRegistration
            + ", noOfPointsOwned=" + noOfPointsOwned + "]";
}
private    String playerName ;
private    String playertype;
private int    noOfCenturies;
private    int noOfHalfCenturies;
private    int noOfCatches;
private String    contactNumber;
private    Date dateOfRegistration;
private int    noOfPointsOwned;
}
