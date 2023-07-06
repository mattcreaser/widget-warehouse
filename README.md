# widget-warehouse

Demo Authenticator implementation for Droidcon Berlin 2023

## Setup

To run the demo you need to deploy a Cognito user pool to host your users. You will need an [AWS Account](https://portal.aws.amazon.com/billing/signup).

1. Install the [Amplify CLI](https://docs.amplify.aws/cli/start/install/)
2. Run `amplify configure` to [configure the CLI](https://docs.amplify.aws/cli/start/install/#configure-the-amplify-cli) to use your AWS Account. This is a one-time step.
3. Run `amplify init` and make the following selections:

```
? Enter a name for the project widgetwarehouse
The following configuration will be applied:

Project information
| Name: widgetwarehouse
| Environment: dev
| Default editor: Visual Studio Code
| App type: javascript
| Javascript framework: none
| Source Directory Path: src
| Distribution Directory Path: dist
| Build Command: npm run-script build
| Start Command: npm run-script start

? Initialize the project with the above configuration? No
? Enter a name for the environment dev
? Choose your default editor: Android Studio
✔ Choose the type of app that you're building · android
Please tell us about your project
? Where is your Res directory:  app/src/main/res
Using default provider  awscloudformation
? Select the authentication method you want to use: AWS profile

For more information on AWS Profiles, see:
https://docs.aws.amazon.com/cli/latest/userguide/cli-configure-profiles.html

? Please choose the profile you want to use default
```

4. Run `amplify add auth` and make the following selections:

```
 Do you want to use the default authentication and security configuration? Default configuration
 Warning: you will not be able to edit these selections.
 How do you want users to be able to sign in? Email
 Do you want to configure advanced settings? No, I am done.
```

5. Run `amplify push` to deploy the Cognito backend in your AWS account.
6. Run the app!

## Useful Links

- [Amplify Android Repository](https://github.com/aws-amplify/amplify-android)
- [Amplify Android UI Repository](https://github.com/aws-amplify/amplify-ui-android/)
- [Amplify Android Docs](https://docs.amplify.aws/lib/q/platform/android/)
- [Authenticator Docs](https://ui.docs.amplify.aws/android/connected-components/authenticator)
