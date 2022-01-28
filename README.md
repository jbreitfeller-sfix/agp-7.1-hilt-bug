# agp-7.1-hilt-bug
If run ./gradlew test you should see a test that does not pass. All the test is trying to do is obtain a ViewModel that should be getting injected by hilt.

If you swap to the AGP-7.0.4-Working tag, ./gradlew test will pass.
