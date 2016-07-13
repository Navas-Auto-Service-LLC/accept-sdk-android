package net.authorize.acceptsdk.datamodel.transaction.callbacks;

import net.authorize.acceptsdk.datamodel.error.AcceptError;
import net.authorize.acceptsdk.datamodel.transaction.response.EncryptTransactionResponse;

/**
 * Callback Interface for Encrypt Transaction
 *
 * Created by Kiran Bollepalli on 07,July,2016.
 * kbollepa@visa.com
 */
public interface EncryptTransactionCallback {

  /**
   * Called when an error occurred caused by sending/receiving a request. It
   * might be an error returned by the gateway as well as by the gateway
   * driver (e.g connection problems, missing request parameters)
   *
   * @param error
   */
    public abstract void onErrorReceived(AcceptError error);

  /**
   * Called when transaction request completed.
   */
  public abstract void onEncryptionFinished(EncryptTransactionResponse response);
}
