package org.jboss.resteasy.star.messaging.queue.push;

import org.jboss.resteasy.star.messaging.queue.push.xml.PushRegistration;

import java.util.List;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
public interface PushStore
{
   void add(PushRegistration reg) throws Exception;

   void remove(PushRegistration reg) throws Exception;

   List<PushRegistration> getByDestination(String destination);
}
