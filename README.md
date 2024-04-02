![ScreenShoot Apps](https://raw.githubusercontent.com/frogobox/frogo-ui/master/docs/image/ss_banner.png?raw=true)

## About This Project (release 👷🔧️👷‍♀️⛏)
[![](https://jitpack.io/v/frogobox/frogo-ui.svg?style=flat-square)](https://jitpack.io/#frogobox/frogo-ui)
[![Android CI](https://github.com/frogobox/frogo-ui/actions/workflows/android-ci.yml/badge.svg)](https://github.com/frogobox/frogo-ui/actions/workflows/android-ci.yml)
[![Scan with Detekt](https://github.com/frogobox/frogo-ui/actions/workflows/detekt-analysis.yml/badge.svg)](https://github.com/frogobox/frogo-ui/actions/workflows/detekt-analysis.yml)
[![pages-build-deployment](https://github.com/frogobox/frogo-ui/actions/workflows/pages/pages-build-deployment/badge.svg)](https://github.com/frogobox/frogo-ui/actions/workflows/pages/pages-build-deployment)

- UI Kit for helping you in apps development
- Avaiable for android and desktop
- Follow-up project from [frogo-ui-kit](https://github.com/amirisback/frogo-ui-kit)
- Privacy Policy [Click Here](https://github.com/frogobox/frogo-ui/blob/master/PRIVACY-POLICY.md)
- License [Click Here](https://github.com/frogobox/frogo-ui/blob/master/LICENSE)

## Screen Shoot
|                             UI KIT LIST                              |                             UI KIT GRID                              |
|:--------------------------------------------------------------------:|:--------------------------------------------------------------------:|
| <img width="200px" height="360px" src="docs/image/ss_home_list.png"> | <img width="200px" height="360px" src="docs/image/ss_home_grid.png"> |

## Version Release
This Is Latest Release

    $version_release = 2.0.1

What's New??

    * Avaiable For Android And Desktop *

## Include Library
<table>
    <tr>
        <th>No.</th>
        <th>Library Name</th>
        <th>Docs</th>
    </tr>
    <tr>
        <td>1.</td>
        <td>FrogoAnimation</td>
        <td><a href="https://github.com/frogobox/frogo-ui#frogoanimation">Click Here</a></td>
    </tr>
    <tr>
        <td>2.</td>
        <td>FrogoLoadingIndicatorView</td>
        <td><a href="https://github.com/frogobox/frogo-ui#frogoloadingindicatorview">Click Here</a></td>
    </tr>
</table>

## Download this project

### Step 1. Add the JitPack repository to your build file (build.gradle : Project)

#### <Option 1> Groovy Gradle

    // Add it in your root build.gradle at the end of repositories:

    allprojects {
        repositories {
            ...
            maven { url 'https://jitpack.io' }
        }
    }

#### <Option 2> Kotlin DSL Gradle

```kotlin
// Add it in your root build.gradle.kts at the end of repositories:

allprojects {
    repositories {
        ...
        maven("https://jitpack.io")
    }
}
```
      
### Step 2. Add the dependency (build.gradle : Module)

#### <Option 1> Groovy Gradle

    dependencies {
        // library frogo-ui
        implementation 'com.github.frogobox:frogo-ui:2.0.1'

        // library frogo-ui for desktop
        implementation 'com.github.frogobox.frogo-ui:core-ui:2.0.1'
    }

#### <Option 2> Kotlin DSL Gradle

    dependencies {
        // library frogo-ui
        implementation("com.github.frogobox:frogo-ui:2.0.1")

        // library frogo-ui for desktop
        implementation("com.github.frogobox.frogo-ui:core-ui:2.0.1")
    }

## Documentation
- Layouts
    - RecyclerView List [Click Here](https://github.com/frogobox/frogo-android-ui-kit/blob/master/docs/recyclerview_list.md)
    - RecyclerView Grid [Click Here](https://github.com/frogobox/frogo-android-ui-kit/blob/master/docs/recyclerview_grid.md)
- Drawables [Click Here](https://github.com/amirisback/frogo-ui-kit/wiki/Drawable)
- Dimens [Click Here](https://github.com/amirisback/frogo-ui-kit/wiki/Dimens)
- Colors [Click Here](https://github.com/amirisback/frogo-ui-kit/wiki/Colors)
- Strings [Click Here](https://github.com/amirisback/frogo-ui-kit/wiki/Strings)
- Styles [Click Here](https://github.com/amirisback/frogo-ui-kit/wiki/Styles)

## FrogoAnimation

### Easy Use Animation

```kotlin
FrogoAnimation().apply {
    setAnimation(Bounce.In(binding.TextView))
    setDuration(1500)
}.start()
```

### Repeated Infinite
```kotlin
FrogoAnimation().apply {
    setAnimation(Attention.Ruberband(binding.TextView))
    setRepeated()
    setDuration(1500)
}.start()
```

### Repeated Count
```kotlin
FrogoAnimation().apply {
    setAnimation(Attention.Ruberband(binding.TextView))
    setRepeated(20)
    setDuration(1500)
}.start()
```

## Animations

To animate the view, add the class name and specific animation method name`setAnimation` to an view. You can include the method `setDuration` to specify duration of animation. Default value for `duration` is `1000 Milliseconds`. Finally you need to add one of the following classes to the view:

| Class Name  |          |        |           |          |         | 		     |
|-------------|----------|--------|-----------|----------|---------|--------|
| `Attention` | `Bounce` | `Fade` | `Flip   ` | `Rotate` | `Slide` | `Zoom` |

### Attention

| `Attention` |                                                                                                                                           | 		          |                                                                                                                                              |
|-------------|-------------------------------------------------------------------------------------------------------------------------------------------|-------------|----------------------------------------------------------------------------------------------------------------------------------------------|
| `Bounce`    | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/1-attention-bounce.c6335f3d.gif"> | `Flash`     | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/2-attention-flash.27fb56e5.gif">     |
| `Pulse`     | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/3-attention-pulse.ee6d1fae.gif">  | `Ruberband` | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/4-attention-ruberband.a701fa5b.gif"> |
| `Shake`     | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/5-attention-shake.62d9243a.gif">  | `Standup`   | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/6-attention-standup.553e1945.gif">   |
| `Swing`     | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/7-attention-swing.602dd7aa.gif">  | `Tada`      | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/8-attention-tada.faa9f3c1.gif">      |
| `Wave`      | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/9-attention-wave.9a37979d.gif">   | `Wobble`    | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/10-attention-wobble.42ac8c56.gif">   |

### Bounce

| `Bounce`	 |                                                                                                                                          | 	         |                                                                                                                                           |
|-----------|------------------------------------------------------------------------------------------------------------------------------------------|-----------|-------------------------------------------------------------------------------------------------------------------------------------------|
| `InDown`  | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/15-bounce-in-down.6aad1cbd.gif"> | `InUp`    | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/13-bounce-in-up.7a1d7c17.gif">    |
| `InLeft`  | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/11-bounce-in-left.ebc9bc0f.gif"> | `InRight` | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/12-bounce-in-right.a66d3b31.gif"> |
| `In`      | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/14-bounce-in.2ef584a6.gif">	     | 		        | 		                                                                                                                                        |

### Fade

| `Fade`    |                                                                                                                                         |            |                                                                                                                                          |
|-----------|-----------------------------------------------------------------------------------------------------------------------------------------|------------|------------------------------------------------------------------------------------------------------------------------------------------|
| `InDown`  | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/18-fade-in-down.24e645e6.gif">  | `InUp`     | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/19-fade-in-up.a2b79fa7.gif">     |
| `InLeft`  | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/16-fade-in-left.6e93da17.gif">  | `InRight`  | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/17-fade-in-right.59345f8c.gif">  |
| `OutDown` | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/22-fade-out-down.4f4ebc27.gif"> | `OutUp`    | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/25-fade-out-up.75f60e2d.gif">    |
| `OutLeft` | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/20-fade-out-left.7f1583e0.gif"> | `OutRight` | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/21-fade-out-right.ff6adf09.gif"> |
| `In`      | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/23-fade-in.532822b1.gif">       | `Out`      | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/24-fade-out.a3ee0d3a.gif">       |

### Flip

| `Flip` |                                                                                                                                      |        |                                                                                                                                      |
|--------|--------------------------------------------------------------------------------------------------------------------------------------|--------|--------------------------------------------------------------------------------------------------------------------------------------|
| `InX`  | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/26-flip-in-x.1de9f264.gif">  | `InY`  | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/27-flip-in-y.8f45c5e1.gif">  |
| `OutX` | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/28-flip-out-x.09be8ac3.gif"> | `OutY` | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/29-flip-out-y.f5c532a8.gif"> |

### Rotate

| `Rotate`      |                                                                                                                                                |                |                                                                                                                                                 |
|---------------|------------------------------------------------------------------------------------------------------------------------------------------------|----------------|-------------------------------------------------------------------------------------------------------------------------------------------------|
| `InDownLeft`  | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/30-rotate-in-down-left.cdd124aa.gif">  | `InDownRight`  | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/31-rotate-in-down-right.f0693f8b.gif">  |
| `InUpLeft`    | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/32-rotate-in-up-left.f818146d.gif">    | `InUpRight`    | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/33-rotate-in-up-right.537606e2.gif">    |
| `OutDownLeft` | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/34-rotate-out-down-left.de06d895.gif"> | `OutDownRight` | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/35-rotate-out-down-right.f4505ac5.gif"> |
| `OutUpLeft`   | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/39-rotate-up-left.de13c028.gif">       | `OutUpRight`   | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/36-rotate-out-up-right.ddb7df75.gif">   |
| `In`          | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/37-rotate-in.08924c36.gif">            | `Out`          | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/38-rotate-out.b127d7a8.gif">            |

### Slide

| `Slide`   |                                                                                                                                          |            |                                                                                                                                           |
|-----------|------------------------------------------------------------------------------------------------------------------------------------------|------------|-------------------------------------------------------------------------------------------------------------------------------------------|
| `InDown`  | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/40-slide-in-down.efa18709.gif">  | `InUp`     | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/43-slide-in-up.0f918432.gif">     |
| `InLeft`  | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/41-slide-in-left.da5a9127.gif">  | `InRight`  | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/42-slide-in-right.f0e33c31.gif">  |
| `OutDown` | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/44-slide-out-down.269616ff.gif"> | `OutUp`    | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/47-slide-out-up.7efa439e.gif">    |
| `OutLeft` | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/45-slide-out-left.4226eca7.gif"> | `OutRight` | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/46-slide-out-right.f283b64b.gif"> |

### Zoom

| `Zoom`    |                                                                                                                                         |            |                                                                                                                                          |
|-----------|-----------------------------------------------------------------------------------------------------------------------------------------|------------|------------------------------------------------------------------------------------------------------------------------------------------|
| `InDown`  | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/48-zoom-in-down.6e41a799.gif">  | `InUp`     | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/51-zoom-in-up.40e3a26e.gif">     |
| `InLeft`  | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/49-zoom-in-left.82604bb4.gif">  | `InRight`  | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/50-zoom-in-right.a419ab92.gif">  |
| `OutDown` | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/52-zoom-out-down.cb3ee254.gif"> | `OutUp`    | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/57-zoom-out-up.0c74d038.gif">    |
| `OutLeft` | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/53-zoom-out-left.79cb419d.gif"> | `OutRight` | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/54-zoom-out-right.7a3ac74d.gif"> |
| `In`      | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/55-zoom-in.1c0c5d5a.gif">       | `Out`      | <img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/56-zoom-out.f0c52b21.gif">       |

## FrogoLoadingIndicatorView

### Demo
![avi](docs/image/demo_apps.gif?raw=true)

### Step 1. Add the FrogoLoadingIndicatorView to your layout:

Simple

```xml
<com.frogobox.loadingindicator.FrogoLoadingIndicatorView
    android:id="@+id/indicator"
    style="@style/FrogoLoadingIndicatorView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:indicatorName="BallPulseIndicator" // Indicator Name
    app:indicatorColor="#FFFFFF"/>
```

### Step 2. It's very simple use just like .
```kotlin
fun hideClick(view: View?) {
    binding.fli.hide()
    // or fli.smoothToHide();
}

fun showClick(view: View?) {
    binding.fli.show()
    // or fli.smoothToShow();
}
```

## Indicators

As seen above in the **Demo**, the indicators are as follows:

**Row 1**
 * `BallPulseIndicator`
 * `BallGridPulseIndicator`
 * `BallClipRotateIndicator`
 * `BallClipRotatePulseIndicator`

**Row 2**
 * `SquareSpinIndicator`
 * `BallClipRotateMultipleIndicator`
 * `BallPulseRiseIndicator`
 * `BallRotateIndicator`

**Row 3**
 * `CubeTransitionIndicator`
 * `BallZigZagIndicator`
 * `BallZigZagDeflectIndicator`
 * `BallTrianglePathIndicator`

**Row 4**
 * `BallScaleIndicator`
 * `LineScaleIndicator`
 * `LineScalePartyIndicator`
 * `BallScaleMultipleIndicator`

**Row 5**
 * `BallPulseSyncIndicator`
 * `BallBeatIndicator`
 * `LineScalePulseOutIndicator`
 * `LineScalePulseOutRapidIndicator`

**Row 6**
 * `BallScaleRippleIndicator`
 * `BallScaleRippleMultipleIndicator`
 * `BallSpinFadeLoaderIndicator`
 * `LineSpinFadeLoaderIndicator`

**Row 7**
 * `TriangleSkewSpinIndicator`
 * `PacmanIndicator`
 * `BallGridBeatIndicator`
 * `SemiCircleSpinIndicator`


## Colaborator
Very open to anyone, I'll write your name under this, please contribute by sending an email to me

- Mail To faisalamircs@gmail.com
- Subject : Github _ [Github-Username-Account] _ [Language] _ [Repository-Name]
- Example : Github_amirisback_kotlin_admob-helper-implementation

Name Of Contribute
- Muhammad Faisal Amir
- Waiting List
- Waiting List

Waiting for your contribute

## Attention !!!
- Please enjoy and don't forget fork and give a star
- Don't Forget Follow My Github Account

![ScreenShoot Apps](docs/image/mad_score.png?raw=true)
