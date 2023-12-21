# java-email-delete

This sample will show you to easily delete a message from your inbox with the Nylas Java SDK.

## Setup

### System dependencies

- Java 18.0.2
- Maven 3.8.6

### Gather environment variables

You'll need the following values:

```text
V3_TOKEN_API=API_KEY
GRANT_ID=GRANT_ID
```

Add the above values to a new `.env` file:

```bash
$ touch .env # Then add your env variables
```

### Install dependencies

```bash
org.slf4j / slf4j-simple / 2.0.9
com.nylas.sdk / nylas / 2.0.0-beta.3
io.github.cdimascio / dotenv-java / 2.2.4
```

# Compilation

To compile we need to use this `maven` command:

```bash
mvn package
```

## Usage

Run the app using the `maven` command:

```bash
$ mvn exec:java -Dexec.mainClass="DeleteEmail"
```

When successfull, it will display a message confirming the deletion


## Learn more

Visit our [Nylas Java SDK documentation](https://developer.nylas.com/docs/developer-tools/sdk/java-sdk/) to learn more.
