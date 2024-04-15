
composer require jeroennoten/laravel-adminlte


php artisan vendor:publish --provider="JeroenNoten\LaravelAdminLte\ServiceProvider" --tag=config
php artisan vendor:publish --provider="JeroenNoten\LaravelAdminLte\ServiceProvider" --tag=assets
php artisan vendor:publish --provider="JeroenNoten\LaravelAdminLte\ServiceProvider" --tag=views



git init
git add .
git commit -m "Inicializar proyecto con AdminLTE integrado"
git remote add origin <URL_del_repositorio_en_GitHub>
git push -u origin master
