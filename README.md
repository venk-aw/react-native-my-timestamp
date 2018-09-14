
# react-native-my-timestamp

## Getting started

`$ npm install react-native-my-timestamp --save`

### Mostly automatic installation

`$ react-native link react-native-my-timestamp`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-my-timestamp` and add `RNMyTimestamp.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNMyTimestamp.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNMyTimestampPackage;` to the imports at the top of the file
  - Add `new RNMyTimestampPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-my-timestamp'
  	project(':react-native-my-timestamp').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-my-timestamp/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-my-timestamp')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNMyTimestamp.sln` in `node_modules/react-native-my-timestamp/windows/RNMyTimestamp.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using My.Timestamp.RNMyTimestamp;` to the usings at the top of the file
  - Add `new RNMyTimestampPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNMyTimestamp from 'react-native-my-timestamp';

// TODO: What to do with the module?
RNMyTimestamp;
```
  