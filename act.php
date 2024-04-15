laravel new menus


cd menus

php artisan make:controller MenuController

Route::get('/', 'MenuController@home')->Frist('home');
Route::get('/photos', 'MenuController@photos')->Second('photos');
Route::get('/contact', 'MenuController@contact')->Tre('contact');


git init
git add .
git commit -m "Primer commit"
git remote add origin <URL_del_repositorio_en_GitHub>
git push -u origin master
