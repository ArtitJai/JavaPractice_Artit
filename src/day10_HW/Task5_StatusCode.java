package day10_HW;

import java.util.Scanner;

public class Task5_StatusCode {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, input Status code");
		
		int code = sc.nextInt();
		
		System.out.println();
		
		switch(code) {
		case 200	:
			System.out.println("OK");
			break;
		case 201	:
			System.out.println("Created");
			break;
		case 202	:
			System.out.println("Accepted");
			break;
		case 301	:
			System.out.println("Moved Permanently");
			break;
		case 303	:
			System.out.println("See Other");
			break;
		case 304	:
			System.out.println("Not Modified");
			break;
		case 307	:
			System.out.println("Temporary edirect");
			break;
		case 400	:
			System.out.println("Bad Request");
			break;
		case 401	:
			System.out.println("Unauthorized");
			break;
		case 403	:
			System.out.println("Forbidden");
			break;
		case 404	:
			System.out.println("Not Found");
			break;
		case 410	:
			System.out.println("Gone");
			break;
		case 500	:
			System.out.println("Internal Server Error");
			break;
		case 503	:
			System.out.println("Service Unavailable");
			break;
			default	:
				System.out.println("Not valid code. Please, try again");
		
		}
		
		sc.close();
	}

}


//## Task5
//
//`HTTP is the protocol that governs communications between web-servers and web clients. Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
//    Some of the codes and their meanings are listed below:
//            status code:
//                200, OK
//                201, Created
//                202, Accepted
//                301, Moved Permanently
//                303, See Other
//                304, Not Modified
//                307, Temporary Redirect
//                400, Bad Request
//                401, Unauthorized
//                403, Forbidden
//                404, Not Found
//                410, Gone
//                500, Internal Server Error
//                503, Service Unavailable
//         declare an int variable called StatusCode, write a switch that prints out, on a line by itself, the appropriate label from the above list based on status.
//                    Example:
//                        if status code = 200
//                    output:
//                        ok
