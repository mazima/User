
package recruitSystem.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by uengine on 2018. 11. 21..
 */

@FeignClient(name="app", url="http://app:8080")
public interface AppService {

    @RequestMapping(method= RequestMethod.PATCH, path="/apps/appNameModify")
    public void appNameModify(@RequestBody App app);

}
