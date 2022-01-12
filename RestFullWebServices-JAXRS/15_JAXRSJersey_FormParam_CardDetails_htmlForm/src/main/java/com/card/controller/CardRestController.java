package com.card.controller;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/payment")
public class CardRestController {

  @Path("/card")
  @POST
  public String doPayment(
      @FormParam("cnum")String cardNum,
      @FormParam("cname")String cardHoldername,
      @FormParam("expMonth")String expMonth,
      @FormParam("expYear")int expYear,
      @FormParam("cvv")String cvv,
      @FormParam("amt")double amt
      ) 
  {
    StringBuffer sb=new StringBuffer();

    String message=
        sb.append("Hello Mr/Mrs/Ms:").append(cardHoldername)
        .append(",Amount :").append(amt)
        .append(" is paid from your card:").append(cardNum)
        .append(", having Details:CVV=").append(cvv)
        .append(",Date:").append(expMonth).append("/").append(expYear)
        .toString();


    return message;
  }
}