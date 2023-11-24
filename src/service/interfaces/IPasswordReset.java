
package service.interfaces;

public interface IPasswordReset {
    boolean reset(int credentialId, String password);
}
