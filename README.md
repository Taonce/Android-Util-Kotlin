# Android-Util-Kotlin
汇集Android日常开发必备的工具类

#### 吐司工具类: `ToastUtil`

```kotlin
Context.toast(text: String)
```

#### 日志管理类: `LogUtil`

```kotlin
fun showDebug(tag: String = "taonce",msg: String)
fun showError(tag: String = "taonce",msg: String)
fun showInfo(tag: String = "taonce",msg: String)
fun showWarning(tag: String = "taonce",msg: String)
```

#### SP文件管理类: `SPUtil`

```kotlin
Context.putSP(key: String, value: Any)
Context.getSP(key: String, defaultValue: Any): Any?
Context.remove(key: String)
Context.clear()
Context.contains(key: String): Boolean
```

#### `String`工具类: `StringUtil`

```kotlin
// 判断字符串是否都是数字
String.isNumAll(): Boolean
// 验证字符串是否符合手机号规则
String.isPhoneNum(): Boolean
// 判断字符串是否都是字母
String.isLetterAll(): Boolean
// 判断车牌号是否规则
String.isCarNum(): Boolean
// 判断身份证号码是否规则
String.isIdCard(): Boolean
// 指定范围内的大写转小写
String.toLowerCase(startIndex: Int = 0, endIndex: Int = this.length): String
// 指定范围内的小写转大写
String.toUpperCase(startIndex: Int = 0, endIndex: Int = this.length): String
// MD5加密
String.md5(): String
// SHA-1加密
String.sha1(): String
// SHA-256加密
String.sha256(): String
```

#### 手机信息工具类: `PhoneUtil`

获取手机的厂商、产品名、品牌、型号、宽度(px)、高度(px)、IMEI、MEID信息

#### 包相关信息工具类: `PackageUtil`

```kotlin
// 获取版本号
Context.getVersionCode(packageName: String = this.packageName): String
// 获取版本名
Context.getVersionName(packageName: String = this.packageName): String
```

#### 网络工具类: `NetUtil`

```kotlin
// 判断网络是否连接
Context.isNetConnected(): Boolean
// 判断是否为 `wifi` 连接
Context.isWifi(): Boolean
```

#### 文件工具类: `FileUtil`

```kotlin
// 判断SD卡是否挂载
isSDCard(): Boolean
// 判断SD卡是否有可用空间
isEnoughMemory(): Boolean
// 获取应用文件目录
Context.getFileDir(customPath: String = ""): File
// 获取应用缓存目录
Context.getCacheDir(customPath: String = ""): File
// 获取应用外置文件目录
Context.getExternalFileDir(customPath: String = ""): File?
// 获取应用外置缓存目录
Context.getExternalCacheDir(customPath: String = ""): File?
// 获取公共下载目录
getPublicDownloadDir(customPath: String = ""): File?
```

#### 尺寸单位转换工具类: `DensityUtil`

```kotlin
// dp2px
Context.dp2px(dp: Float): Float
// sp2dp
Context.sp2sp(sp: Float): Float
// sp2px
Context.sp2px(sp: Float): Float
// px2sp
Context.px2sp(px: Float): Float
```

[二维码](<https://github.com/Taonce/Android-Util-Kotlin/blob/master/app/src/main/res/drawable/qrcode.png>)

