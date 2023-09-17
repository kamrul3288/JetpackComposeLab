
package com.iamkamrul.ui.utils

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Preview


@Preview(name = "Phone: Light", device = "spec:shape=Normal,width=360,height=640,unit=dp,dpi=480",showBackground = true)
@Preview(name = "Phone: Dar", device = "spec:shape=Normal,width=360,height=640,unit=dp,dpi=480",uiMode = Configuration.UI_MODE_NIGHT_YES,showBackground = true)
annotation class DevicePreviews


@Preview(name = "Light Mode",showBackground = true)
@Preview(name = "Dark Mode", uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
annotation class ComponentPreviews