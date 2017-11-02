import com.testvagrant.commons.entities.DeviceDetails;
import com.testvagrant.commons.entities.device.OSVersion;
import com.testvagrant.mdb.android.ADB;
import com.testvagrant.mdb.android.Android;
import com.testvagrant.mdb.enums.AOSVersion;
import com.testvagrant.mdb.predicates.filters.OSFilter;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AndroidDevicesTest {


    @Test
    public void getAndroidDevices() {
        ADB adb = new Android();
        OSVersion osVersion = new OSVersion();
        osVersion.setName(AOSVersion.LOLLIPOP.getName());
        osVersion.setVersion(AOSVersion.LOLLIPOP.getVersion());
        osVersion.setBaseVersion(AOSVersion.LOLLIPOP.getBaseVersion());
        List<DeviceDetails> devices = adb.getDevices(OSFilter.eq(osVersion));
        Assert.assertEquals(true,devices.size()>0);
    }
}
