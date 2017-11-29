package org.webservices.jaxrs.messenger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class CommentResource {

	@GET
	public String test(){
		return "Test Subresource!!!";
	}
	
	@GET
	@Path("/{commentId}")
	public String test2(@PathParam("messageId") long mid, @PathParam("commentId") long cid){
		return "Testing with Message ID: "+mid+" Comment ID: "+cid;
	}	
}
