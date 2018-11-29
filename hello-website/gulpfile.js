const gulp = require('gulp');
const babel = require('gulp-babel');
const rollup = require('gulp-rollup');
const sourcemaps = require('gulp-sourcemaps');

// roll for development build with soure maps,
gulp.task('roll', () => {
    return gulp.src('src/**/*.js')
        .pipe(sourcemaps.init())
        .pipe(babel({
            presets: ['es2017'],
        }))
        .pipe(rollup({
            entry: './src/main.js',
            format: 'cjs',
        }))
        .pipe(sourcemaps.write(''))
        .pipe(gulp.dest('dist'));
});

// assemeble for production build,
gulp.task('assemble', () => {

});