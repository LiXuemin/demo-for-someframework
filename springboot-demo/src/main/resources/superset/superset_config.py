# Superset specific config
ROW_LIMIT = 5000

SUPERSET_WEBSERVER_PORT = 8088

# Flask App Builder configuration
# Your App secret key will be used for securely signing the session cookie
# and encrypting sensitive information on the database
# Make sure you are changing this key for your deployment with a strong key.
# You can generate a strong key using `openssl rand -base64 42`

SECRET_KEY = 'dgvsjn41a3mEICVut9BPxnbldvC8RyR5xQD05i3CZNtZ0OKEMkt8IDvu'

# The SQLAlchemy connection string to your database backend
# This connection defines the path to the database that stores your
# superset metadata (slices, connections, tables, dashboards, ...).
# Note that the connection information to connect to the datasources
# you want to explore are managed directly in the web UI
# SQLALCHEMY_DATABASE_URI = 'sqlite:////path/to/superset.db'
SQLALCHEMY_DATABASE_URI = 'mysql://test187:test187@192.168.54.187/superset?charset=utf8'

# Flask-WTF flag for CSRF
WTF_CSRF_ENABLED = True
# Add endpoints that need to be exempt from CSRF protection
WTF_CSRF_EXEMPT_LIST = []
# A CSRF token that expires in 1 year
WTF_CSRF_TIME_LIMIT = 60 * 60 * 24 * 365

# Set this API key to enable Mapbox visualizations
MAPBOX_API_KEY = ''

BABEL_DEFAULT_LOCALE = "zh"