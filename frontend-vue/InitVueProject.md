# 使用 @vue/cli-init 初始化vue项目

## 安装 `@vue/cli-init`

``` bash
npm i -g @vue/cli
npm i -g @vue/cli-init
```

## vue初始化（基于webpack）

``` bash
G:\workspace\java\Springboot-Vue-template>vue init webpack frontend-vue

? Project name frontend-vue
? Project description A Vue.js project
? Author sogrey <suzhaoheng2006@163.com>
? Vue build standalone
? Install vue-router? Yes
? Use ESLint to lint your code? Yes
? Pick an ESLint preset Standard
? Set up unit tests Yes
? Pick a test runner jest
? Setup e2e tests with Nightwatch? Yes
? Should we run `npm install` for you after the project has been created? (recommended) yarn

   vue-cli · Generated "frontend-vue".


# Installing project dependencies ...
# ========================

yarn install v1.22.10
info No lockfile found.
[1/5] Validating package.json...
[2/5] Resolving packages...
warning autoprefixer > browserslist@2.11.3: Browserslist 2 could fail on reading Browserslist >3.0 config used in other tools.
warning babel-core > babel-register > core-js@2.6.12: core-js@<3.4 is no longer maintained and not recommended for usage due to the number of issues. Because of the V8 engine whims, feature detection in old core-js versions could cause a slowdown up to 100x even if nothing is polyfilled. Please, upgrade your dependencies to the actual version of core-js.
warning babel-core > babel-runtime > core-js@2.6.12: core-js@<3.4 is no longer maintained and not recommended for usage due to the number of issues. Because of the V8 engine whims, feature detection in old core-js versions could cause a slowdown up to 100x even if nothing is polyfilled. Please, upgrade your dependencies to the actual version of core-js.
warning babel-eslint@8.2.6: babel-eslint is now @babel/eslint-parser. This package will no longer receive updates.
warning chromedriver > request@2.88.2: request has been deprecated, see https://github.com/request/request/issues/3142
warning chromedriver > request > har-validator@5.1.5: this library is no longer supported
warning chromedriver > request > uuid@3.4.0: Please upgrade  to version 7 or higher.  Older versions may use Math.random() in certain circumstances, which is known to be problematic.  See https://v8.dev/blog/math-random for details.
warning css-loader > cssnano > autoprefixer > browserslist@1.7.7: Browserslist 2 could fail on reading Browserslist >3.0 config used in other tools.
warning css-loader > cssnano > postcss-merge-rules > browserslist@1.7.7: Browserslist 2 could fail on reading Browserslist >3.0 config used in other tools.
warning css-loader > cssnano > postcss-merge-rules > caniuse-api > browserslist@1.7.7: Browserslist 2 could fail on reading Browserslist >3.0 config used in other tools.
warning css-loader > cssnano > postcss-svgo > svgo@0.7.2: This SVGO version is no longer supported. Upgrade to v2.x.x.
warning css-loader > cssnano > postcss-merge-rules > postcss-selector-parser > flatten@1.0.3: flatten is deprecated in favor of utility frameworks such as lodash.
warning eslint > file-entry-cache > flat-cache > circular-json@0.3.3: CircularJSON is in maintenance only, flatted is its successor.
warning eslint-loader@1.9.0: This loader has been deprecated. Please use eslint-webpack-plugin
warning extract-text-webpack-plugin@3.0.2: Deprecated. Please use https://github.com/webpack-contrib/mini-css-extract-plugin
warning html-webpack-plugin@2.30.1: out of support
warning jest > jest-cli > jest-environment-jsdom > jsdom > request@2.88.2: request has been deprecated, see https://github.com/request/request/issues/3142
warning jest > jest-cli > jest-haste-map > sane@2.5.2: some dependency vulnerabilities fixed, support for node < 10 dropped, and newer ECMAScript syntax/features added
warning jest > jest-cli > jest-environment-jsdom > jsdom > left-pad@1.3.0: use String.prototype.padStart()
warning jest > jest-cli > jest-environment-jsdom > jsdom > request-promise-native@1.0.9: request-promise-native has been deprecated because it extends the now deprecated request package, see https://github.com/request/request/issues/3142
warning jest > jest-cli > jest-haste-map > sane > fsevents@1.2.13: fsevents 1 will break on node v14+ and could be using insecure binaries. Upgrade to fsevents 2.
warning jest > jest-cli > jest-haste-map > sane > micromatch > snapdragon > source-map-resolve@0.5.3: See https://github.com/lydell/source-map-resolve#deprecated
warning jest > jest-cli > jest-haste-map > sane > micromatch > snapdragon > source-map-resolve > source-map-url@0.4.1: See https://github.com/lydell/source-map-url#deprecated
warning jest > jest-cli > jest-haste-map > sane > micromatch > snapdragon > source-map-resolve > resolve-url@0.2.1: https://github.com/lydell/resolve-url#deprecated
warning jest > jest-cli > jest-haste-map > sane > micromatch > snapdragon > source-map-resolve > urix@0.1.0: Please see https://github.com/lydell/urix#deprecated
warning nightwatch > mocha-nightwatch > mkdirp@0.5.1: Legacy versions of mkdirp are no longer supported. Please update to mkdirp 1.x. (Note that the API surface has changed to use Promises in 1.x.)
warning nightwatch > mocha-nightwatch > json3@3.3.2: Please use the native JSON object instead of JSON 3
warning nightwatch > proxy-agent > socks-proxy-agent > socks@1.1.10: If using 2.x branch, please upgrade to at least 2.1.6 to avoid a serious bug with socket data flow and an import issue introduced in 2.1.0
warning optimize-css-assets-webpack-plugin > cssnano > cssnano-preset-default > postcss-svgo > svgo@1.3.2: This SVGO version is no longer supported. Upgrade to v2.x.x.
warning uglifyjs-webpack-plugin > uglify-es@3.3.9: support for ECMAScript is superseded by `uglify-js` as of v3.13.0
warning webpack > watchpack > watchpack-chokidar2 > chokidar@2.1.8: Chokidar 2 does not receive security updates since 2019. Upgrade to chokidar 3 with 15x fewer dependencies
warning webpack > watchpack > watchpack-chokidar2 > chokidar > fsevents@1.2.13: fsevents 1 will break on node v14+ and could be using insecure binaries. Upgrade to fsevents 2.
warning webpack > node-libs-browser > url > querystring@0.2.0: The querystring API is considered Legacy. new code should use the URLSearchParams API instead.
warning webpack-bundle-analyzer > bfj-node4@5.3.1: Switch to the `bfj` package for fixes and new features!
warning webpack-dev-server > chokidar@2.1.8: Chokidar 2 does not receive security updates since 2019. Upgrade to chokidar 3 with 15x fewer dependencies
warning webpack-dev-server > sockjs > uuid@3.4.0: Please upgrade  to version 7 or higher.  Older versions may use Math.random() in certain circumstances, which is known to be problematic.  See https://v8.dev/blog/math-random for details.
[3/5] Fetching packages...
info fsevents@1.2.13: The platform "win32" is incompatible with this module.
info "fsevents@1.2.13" is an optional dependency and failed compatibility check. Excluding it from installation.
info fsevents@2.3.2: The platform "win32" is incompatible with this module.
info "fsevents@2.3.2" is an optional dependency and failed compatibility check. Excluding it from installation.
[4/5] Linking dependencies...
[5/5] Building fresh packages...
success Saved lockfile.
Done in 99.37s.


Running eslint --fix to comply with chosen preset rules...
# ========================

yarn run v1.22.10
$ eslint --ext .js,.vue src test/unit test/e2e/specs --fix
Done in 13.04s.

# Project initialization finished!
# ========================

To get started:

  cd frontend-vue
  npm run dev

Documentation can be found at https://vuejs-templates.github.io/webpack



G:\workspace\java\Springboot-Vue-template>

```

