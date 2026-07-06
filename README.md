# suzume

suzume (雀, sparrow) is a full-featured X/Twitter client for Android, written in modern Kotlin with Jetpack Compose.

It reads X without an account. No login wall, no ads, no tracking. You install it, open it, and read. The reliable core is fully anonymous. The account features that genuinely need credentials are either rebuilt as local features (subscriptions, a merged home timeline, bookmarks) or gated behind an optional, clearly labeled cookie plane that you turn on yourself.

suzume is a phone-app sibling of x-cli (the Go scraping engine) and tori (the offline X archiver).

## Status

Early development. Milestone M0 is the build scaffold: a three-module Gradle project that produces a themed shell app. The reading features arrive milestone by milestone. See the plan in the spec.

## What it will do

Read features work anonymously and are the core:

- Timelines, tweet detail, full conversation threads, quote and retweet chains
- Profiles with all tabs, followers and following, search for tweets and users
- Trends, explore, hashtags, lists, polls, cards, and media (photos, video, GIF, alt text)

Local rebuilds of account features, no credentials required:

- Follow users locally (subscriptions) and read a merged home timeline
- Bookmark tweets locally
- Get notified when a subscribed user posts

Optional cookie plane (you supply your own auth cookies, best effort, ban-risk labeled):

- Real posting, likes, retweets, server-side bookmarks, and the account home timeline

DMs, ads, monetization surfaces, and Grok are out of scope.

## Architecture

- `:engine` is a pure JVM Kotlin library that owns all X access (guest token, transaction id signing, GraphQL catalog, syndication fallback). No Android imports, fully unit-testable.
- `:data` is an Android library: Room, DataStore, repositories, Paging 3, the subscription poller.
- `:app` is the Jetpack Compose application: screens, navigation, theming, widgets.

Networking is OkHttp plus kotlinx.serialization. Images use Coil 3, video uses Media3 ExoPlayer, DI is Hilt, pagination is Paging 3.

## Build

Requires JDK 21 and the Android SDK (platform 35, build-tools 35).

```
./gradlew assembleDebug
```

The debug APK lands at `app/build/outputs/apk/debug/app-debug.apk`.

Run the checks:

```
./gradlew ktlintCheck test
```

### Debug keystore

`keystore/debug.keystore` is checked into the repo on purpose, with the standard Android debug credentials (store password `android`, alias `androiddebugkey`, key password `android`). It signs debug builds only, which can never ship to a store, so it is public by design. This keeps debug signatures stable across machines and CI. Release signing uses a separate key that is never in the repo.

## License

AGPL-3.0-only. suzume's anonymous access approach descends from the nitter and x-cli lineage, which is copyleft, so suzume is too. If you run a modified suzume as a network service, the AGPL requires you to offer the modified source to its users. See LICENSE and NOTICE.

suzume is not affiliated with X Corp.
