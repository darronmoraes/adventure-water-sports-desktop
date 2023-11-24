package system;

public enum HttpStatusCode {
    OK(200),
    CLIENT_ERROR(400);
    
    HttpStatusCode(int code) {
    }
}
